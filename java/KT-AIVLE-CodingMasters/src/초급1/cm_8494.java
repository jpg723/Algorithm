package 초급1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class cm_8494 {
    //8494. 무향 그래프 1

    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] graph = new int[N][N];

        // 간선 정보 입력받아 인접 행렬에 반영
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int node1 = Integer.parseInt(st.nextToken()) - 1; // 0부터 인덱스 시작이므로 1 빼줌
            int node2 = Integer.parseInt(st.nextToken()) - 1; // 0부터 인덱스 시작이므로 1 빼줌
            graph[node1][node2] = 1;
            graph[node2][node1] = 1; // 무향 그래프이므로 양방향 모두 연결되어 있음
        }

        // 인접 행렬 출력
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(graph[i][j] + " ");
            }
            System.out.println();
        }

    }
}
