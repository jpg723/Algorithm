package 초급;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class cm_8492 {
    //8492. 바닥 공사 1

    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        // 다이나믹 프로그래밍을 위한 배열 초기화
        int[] dp = new int[N + 1];

        // 초기값 설정
        dp[1] = 1;
        dp[2] = 2;

        // 다이나믹 프로그래밍 진행
        for (int i = 3; i <= N; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]);
            System.out.println(dp[i]);
        }

        // 결과 출력
        System.out.println(dp[N]);
    }
}
