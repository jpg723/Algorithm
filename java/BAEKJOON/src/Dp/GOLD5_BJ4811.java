package Dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GOLD5_BJ4811 {
    //https://www.acmicpc.net/problem/4811
    // 알약

    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int pill = -1;
        while(true){
            pill = Integer.parseInt(br.readLine());

            if(pill == 0)
                break;

            System.out.println(dp(pill));
        }
    }

    public static long dp(int n){

        long[] dp = new long[31];

        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;

        for(int i = 3; i < 31; i++){
            long cnt = 0;
            for(int j = 0; j < i; j++){
                cnt += dp[j] * dp[i-1-j];
            }
            dp[i] = cnt;
        }

        return dp[n];
    }
}
