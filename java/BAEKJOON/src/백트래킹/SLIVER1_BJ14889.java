package 백트래킹;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SLIVER1_BJ14889 {
    /*https://www.acmicpc.net/problem/14889
    스타트와 링크
     */

    public static int[][] arr;
    public static boolean[] visit;
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        arr = new int[N][N];
        visit = new boolean[N];

        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for(int j = 0; j < N; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dfs(0, 0, N/2);

    }

    public static void dfs(int index, int depth, int n){
        if(n == depth){
            System.out.println();
            return;
        }

        else{
            for(int i = index; i < n; i++){
                if(visit[i] == false){
                    visit[i] = true;
                    dfs(index + 1, depth + 1, n);
                    visit[i] = false;
                }
            }
        }
    }
}
