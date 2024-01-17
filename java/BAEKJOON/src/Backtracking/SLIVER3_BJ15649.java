package Backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SLIVER3_BJ15649 {
    /*https://www.acmicpc.net/problem/15649
    N과 M (1)
     */


    public static int[] arr;
    public static boolean[] visit;
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        arr = new int[M];
        visit = new boolean[N];

        dfs(N, M, 0);
    }

    public static void dfs(int n, int m, int depth){

        if(m == depth){

            for(int var: arr) {
                System.out.print(var + " ");
            }
            System.out.println();
            return;
        }

        else{
            for(int i = 0; i < n; i++){
                if(visit[i] == false){
                    visit[i] = true;
                    arr[depth] = i + 1;
                    dfs(n, m, depth + 1);

                    visit[i] = false;
                }
            }
        }
    }
}
