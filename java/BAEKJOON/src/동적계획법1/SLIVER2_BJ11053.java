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

        for(int i = n - 1; i >= 0; i--){
            start = a[i];
            int length = 1;

            for(int j = n - 2; j >= 0; j--) {
                System.out.println(start + " " + a[j]);
                if (start > a[j]) {
                    length++;
                    start = a[j];
                    System.out.println(length);
                }
            }
            System.out.println();

            if(max < length)
                max = length;
        }

        for(int i = 0; i < 0; i--){
            start = a[i];
            int length = 1;

            for(int j = n - 2; j >= 0; j--) {
                System.out.println(start + " " + a[j]);
                if (start > a[j]) {
                    length++;
                    start = a[j];
                    System.out.println(length);
                }
            }
            System.out.println();

            if(max < length)
                max = length;
        }

        System.out.println(max);
    }
}
