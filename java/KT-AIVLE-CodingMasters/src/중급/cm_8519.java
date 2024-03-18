package 중급;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class cm_8519 {
    // 8519. 태국 택시
    // 알고리즘: 최소신장트리 (참고- https://sskl660.tistory.com/72)
    static int V, E;
    static int[][] graph;
    // 각 노드의 부모
    static int[] parent;
    // 최종적으로 연결된 최소 신장 트리 연결 비용.
    static int final_cost;
    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        graph = new int[M][3];

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            graph[i][0] = Integer.parseInt(st.nextToken());
            graph[i][1] = Integer.parseInt(st.nextToken());
            graph[i][2] = Integer.parseInt(st.nextToken());
        }

        parent = new int[N];
        final_cost = 0;


        // 간선 비용 순으로 오름차순 정렬
        Arrays.sort(graph, (o1, o2) -> Integer.compare(o1[2], o2[2]));

        // makeSet
        for (int i = 0; i < N; i++) {
            parent[i] = i;
        }
        // 낮은 비용부터 크루스칼 알고리즘 진행
        for (int i = 0; i < M; i++) {
            // 사이클이 존재하지 않는 경우에만 간선을 선택한다(여기서는 최종 비용만 고려하도록 하겠다).
            if (find(graph[i][0] - 1) != find(graph[i][1] - 1)) {
                union(graph[i][0] - 1, graph[i][1] - 1);
                final_cost += graph[i][2];
            }
        }

        System.out.println(final_cost);
    }

    private static void union(int a, int b) {
        a = find(a);
        b = find(b);
        if (a > b) {
            parent[a] = b;
        } else {
            parent[b] = a;
        }
    }

    private static int find(int x) {
        if (parent[x] == x)
            return x;
        else
            return find(parent[x]);
    }
}
