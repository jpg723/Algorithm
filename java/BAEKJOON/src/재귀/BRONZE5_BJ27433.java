package 재귀;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BRONZE5_BJ27433 {
    /*
    https://www.acmicpc.net/problem/27433
    팩토리얼2
     */
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //N입력
        long N = Integer.parseInt(br.readLine());

        System.out.println(calculate(N));

    }

    public static long calculate(long n){

        if(n == 0)
            return 1;

        else{
            return (n * calculate(n - 1));
        }
    }
}
