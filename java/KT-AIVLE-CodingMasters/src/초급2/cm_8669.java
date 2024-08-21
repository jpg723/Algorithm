package 초급2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class cm_8669 {
    //8669. 깊이 우선 탐색
    static boolean[] visited;
    static int[][] graph;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        // N과 E를 입력 받음
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        // 그래프와 방문 배열 초기화
        graph = new int[N+1][N+1];
        visited = new boolean[N+1];

        // 간선 정보를 입력 받음
        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            // 양방향 간선으로 그래프를 설정
            graph[u][v] = graph[v][u] = 1;
        }

        // 노드 0부터 DFS 시작
        dfs(N, 1);
    }

    // 재귀함수로 구현한 DFS
    static void dfs(int V, int C) {
        visited[C] = true;  // 현재 노드를 방문했다고 표시
        System.out.print(C +  " ");  // 현재 노드 출력

        // 인접 노드를 순회
        for(int x=0; x < V+1; x++ ) {
            // 아직 방문하지 않은 노드이며, 간선이 존재한다면
            if(!visited[x] && graph[C][x] != 0 ) {
                dfs(V, x);  // 해당 노드로 DFS 진행
            }
        }
    }
}
