package Backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class SLIVER3_BJ15657 {
    /*https://www.acmicpc.net/problem/15657
    N과M(8)
     */

    static int[] arr;
    static boolean[] visit;
    static int[] result;

    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        arr = new int[N];
        visit = new boolean[N];
        result = new int[M];

        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0;  i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        dfs(N, M, 0, 0);

        System.out.print(sb);
    }

    public static void dfs(int n, int m, int depth, int start){

        if(m == depth){
            for(int var: result)
                sb.append(var + " ");
            sb.append("\n");
        }

        else{
            for(int i = start; i < n; i++){
                if(visit[i] == false){
                    result[depth] = arr[i];
                    dfs(n, m, depth + 1, i);
                    visit[i] = false;
                }
            }
        }
    }
}
