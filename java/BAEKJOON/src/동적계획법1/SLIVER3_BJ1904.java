package 동적계획법1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SLIVER3_BJ1904 {
    /*https://www.acmicpc.net/problem/1904
    01타일
     */
    public static int[] dp = new int[1000001];
    public static void main(String args[])throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;

        // -1 로 초기화
        for(int i = 3; i < dp.length; i++) {
            dp[i] = -1;
        }

        System.out.println(Tile(N));
    }

    public static int Tile(int n){
        if(dp[n] == -1) {
            dp[n] = (Tile(n - 1) + Tile((n - 2))) % 15746;
        }
        return dp[n];
    }
}
