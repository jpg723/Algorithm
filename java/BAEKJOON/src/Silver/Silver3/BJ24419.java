package Silver.Silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.Math.max;

public class BJ24419 {
    static int cnt = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력
        int n = Integer.parseInt(br.readLine());
        int[][] m = new int[n + 1][n + 1];

        for (int i = 1; i <= n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int j = 1; j <= n; j++) {
                m[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        System.out.printf("%d %d\n", matrix_path(m, n), n * n);

    }

    public static int matrix_path(int m[][], int n) {
        int[][] d = new int [n + 1][n + 1];

        for (int i = 0; i <= n; i++)
            d[i][0] = 1;

        for (int j = 0; j <= n; j++)
            d[0][j] = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                d[i][j] = d[i][j] + d[i - 1][j] + d[i][j - 1];
                d[i][j] %= 1000000007;
            }
        }

        return d[n][n];
    }

}