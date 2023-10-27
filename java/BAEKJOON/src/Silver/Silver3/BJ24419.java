package Silver.Silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

import static java.lang.Math.max;

public class BJ24419 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[][]m = new int[n + 1][n + 1];

        for(int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(),  " ");
            for (int j = 0; j < n; j++){

                m[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        //System.out.println(matrix_path(m, n));
        System.out.println(matrix_path2(m, n));
    }

    public static int matrix_path(int m[][], int n) {  // (1, 1)에서 (n, n)에 이르는 최고 점수를 구한다.

        return matrix_path_rec(m, n, n);
    }
    public static int matrix_path_rec(int m[][], int i, int j) {  // (1, 1)에서 (i, j)에 이르는 최고 점수를 구한다.
        if (i == 0 || j == 0)
        return 0;
    else
        return (m[i][j] + (max(matrix_path_rec(m, i-1, j), matrix_path_rec(m, i, j-1))));
    }

    public static int matrix_path2(int m[][], int n) {  // (1, 1)에서 (n, n)에 이르는 최고 점수를 구한다.
        int[][] d = new int [n + 1][n + 1];

        for (int i = 0; i <= n; i++)
            d[i][0] = 1;

        for (int  j = 1; j <= n; j++)
            d[0][j] = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++)
                d[i][j] = m[i][j] + max(d[i - 1][j], d[i][j - 1]);
        }
        return d[n][n];
    }
}
