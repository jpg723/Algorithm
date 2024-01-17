package Backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class SLIVER2_BJ15664 {
    /*
        https://www.acmicpc.net/problem/15664
        N과 M(10)
     */

    static int[] arr;
    static boolean[] visit;
    static int[] result;

    public static void main(String[] args)throws IOException{
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        arr = new int[N];
        visit = new boolean[N];
        result = new int[M];

        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        dfs(N, M, 0, 0);

        System.out.print(sb);
    }

    static StringBuilder sb = new StringBuilder();
    public static void dfs(int n, int m, int depth, int start){

        if(m == depth){
            for(int var: result){
                sb.append(var + " ");
            }
            sb.append("\n");
        }

        else{
            int before = 0;

            for(int i = start; i < n; i++){
                if(visit[i] == false){
                    if(before != arr[i]) {
                        visit[i] = true;
                        before = arr[i];
                        result[depth] = arr[i];
                        dfs(n, m, depth + 1, i + 1);
                        visit[i] = false;
                    }
                }
            }
        }
    }
}
