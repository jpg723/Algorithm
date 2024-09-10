package Graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class SLIVER1_BJ2178 {
    
    //https://www.acmicpc.net/problem/2178
    // 미로 탐색

    static int[][] arr;
    static boolean[][] check;
    static int[] dx = { -1, 1, 0, 0 }; //x방향배열-상하
    static int[] dy = { 0, 0, -1, 1 }; //y방향배열-좌우
    static int result = 0;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        arr = new int[N][M];
        check = new boolean[N][M];

        for(int i = 0 ; i < N; i ++) {

            String col = br.readLine();

            for(int j = 0; j < M; j++){
                char c = col.charAt(j);
                int num = c - 48;
                arr[i][j] = num;
            }
        }

        check[0][0] = true;

        bfs(N, M, 0, 0);
        System.out.println(arr[N-1][M-1]);
    }

    public static void bfs(int n, int m, int x, int y) {

        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{x, y});

        while (!q.isEmpty()) {

            int now[] = q.poll();
            int nowX = now[0];
            int nowY = now[1];

            for (int i = 0; i < 4; i++) {
                int nextX = nowX + dx[i];
                int nextY = nowY + dy[i];

                if (nextX < 0 || nextY < 0 || nextX >= n || nextY >= m)
                    continue;
                if (check[nextX][nextY] || arr[nextX][nextY] == 0)
                    continue;

                q.add(new int[]{nextX, nextY});
                arr[nextX][nextY] = arr[nowX][nowY] + 1;
                check[nextX][nextY] = true;
            }
        }
    }
}
