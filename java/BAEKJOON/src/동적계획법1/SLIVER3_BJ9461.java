package 동적계획법1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SLIVER3_BJ9461 {
    /*https://www.acmicpc.net/problem/9461
    파도반 수열
     */
    public static int[] dp = new int[100];
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 1;

        for(int i = 0; i < T; i++){
            int N = Integer.parseInt(br.readLine());

        }
    }

    public static void
}
