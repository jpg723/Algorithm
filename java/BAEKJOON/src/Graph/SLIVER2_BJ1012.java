package Graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SLIVER2_BJ1012 {
    //https://www.acmicpc.net/problem/1012
    // 유기농 배추

    static boolean [][] arr;
    static boolean [] check;
    static int count = 0;
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st =  new StringTokenizer(br.readLine(), " ");

        int T = Integer.parseInt(st.nextToken());

        st =  new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < T; i++){
            int M = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());

            arr = new boolean[M+1][N+1];
            check = new boolean[K+1];
            count = 0;
            int a = 0;
            int b = 0;

            for(int j = 0; j < K; j++){
                st =  new StringTokenizer(br.readLine(), " ");
                a = Integer.parseInt(st.nextToken());
                b = Integer.parseInt(st.nextToken());
            }

            dfs(K, 0);
            System.out.println(count);
        }

    }

    public static void dfs(int n, int v){

        check[v] = true;
        count++;

        for(int i = 0; i <= n; i++){
            if(arr[v][i] == true && !check[i]){
                dfs(n, i);
            }
        }
    }

}
