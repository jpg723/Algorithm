package 백트래킹;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class SLIVER3_BJ15656 {

    static int[] arr;
    static boolean[] visit;
    static int[] result;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args)throws IOException{
        /*
        N과 M(7)
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        visit = new boolean[N];
        arr = new int[N];
        result = new int[M];

        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < N; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(arr);
        dfs(N, M, 0);

        System.out.println(sb);
    }
    public static void dfs(int n, int m, int depth)throws IOException{

        if(m == depth){
            for(int var: result) {
                sb.append(var + " ");
            }
            sb.append("\n");
        }

        else{
            for(int i = 0; i < n; i++){
                if(visit[i] == false){
                    result[depth] = arr[i];
                    dfs(n, m, depth + 1);
                }
            }
        }
    }
}
