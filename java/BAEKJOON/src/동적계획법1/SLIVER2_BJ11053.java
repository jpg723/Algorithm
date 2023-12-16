package 동적계획법1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SLIVER2_BJ11053 {
    /*https://www.acmicpc.net/problem/11053
    가장 긴 증가하는 부분 수열
     */
    public static void main(String agrs[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < N; i++)
            A[i] = Integer.parseInt(st.nextToken());

        calculate(A, N);
    }

    public static void calculate(int[] a, int n){

        int start = 0;
        int max = 0;

        for(int i = 0; i < n; i++){
            for(int j = i ; j < n; j++){

            }
        }
    }
}
