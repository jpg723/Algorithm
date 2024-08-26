package Dfs_Bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class SLIVER2_BJ1260 {

    /*https://www.acmicpc.net/problem/1260
    DFS와 BFS
     */

    static StringBuilder sb = new StringBuilder();
    static Queue<Integer> q = new LinkedList<>();
    static boolean[][] arr;
    static boolean[] check;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 정점의 개수
        int M = Integer.parseInt((st.nextToken())); // 간선의 개수
        int V = Integer.parseInt(st.nextToken()); // 탐색을 시작할 정점의 번호

         arr = new boolean[N+1][N+1];
         check = new boolean[N+1];

        for(int i = 0 ; i < M; i ++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            arr[a][b] = arr[b][a] =  true;
        }

        dfs(N, V);
        sb.append("\n");
        check = new boolean[N+1]; // 방문 확인 변수 초기화
        bfs(N, V);
        System.out.println(sb);

    }

    public static void dfs(int n, int v) {

        check[v] = true;
        sb.append(v + " ");

        for(int i = 0; i <= n; i++) {
            if(arr[v][i] == true && !check[i])
                dfs(n, i);
        }
    }

    public static void bfs(int n, int v) {

        q.add(v);
        check[v] = true;

        while(!q.isEmpty()) {

            v = q.poll();
            sb.append(v + " ");

            for(int i = 1; i <= n; i++) {
                if(arr[v][i] == true && !check[i]) {
                    q.add(i);
                    check[i] = true;
                }
            }
        }


    }
}
