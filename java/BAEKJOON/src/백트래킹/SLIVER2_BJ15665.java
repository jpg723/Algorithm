package 백트래킹;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class SLIVER2_BJ15665 {
    /*
        https://www.acmicpc.net/problem/15665
        N과 M(11)
     */

    static int[] arr;
    static int[] result;
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        arr = new int[N];
        result = new int[M];

        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        dfs(N, M, 0);

        System.out.print(sb);
    }

    static StringBuilder sb = new StringBuilder();
    public static void dfs(int n, int m, int depth){

        if(m == depth){
            for(int var: result){
                sb.append(var + " ");
            }
            sb.append("\n");
        }

        else{
            int before = 0;

            for(int i = 0; i < n; i++){
                if(before != arr[i]){
                    before = arr[i];
                    result[depth] = arr[i];
                    dfs(n, m, depth + 1);
                }

            }
        }
    }

}
