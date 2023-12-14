package 동적계획법1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SLIVER3_BJ9461 {
    /*https://www.acmicpc.net/problem/9461
    파도반 수열
     */

    public static long[] P = new long[10000000];
    public static void main(String args[])throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());

            P[0] = 1;
            P[1] = 1;
            P[2] = 1;

            // -1 로 초기화(N이 0, 1, 2를 제외한 수면 Tile함수를 실행시키기 위해서)
            for (int j = 3; j < N; j++) {
                P[j] = -1;
            }

            System.out.println(DP(N - 1));
        }
    }

    public static long DP(int n){
        if(P[n] == -1) {
            P[n] = (DP(n - 2) + DP((n - 3)));
        }
        return P[n];
    }
}
