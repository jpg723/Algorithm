package 재귀;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BRONZE2_BJ10870 {
    /*https://www.acmicpc.net/problem/10870
    피보나치 수 5
     */

    public static void main(String arags[])throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        System.out.println(fibo(N));
    }

    public static int fibo(int n){

        if(n == 0)
            return 0;

        if(n == 1 || n == 2)
            return 1;

        else
            return fibo(n - 1) + fibo(n - 2);
    }
}
