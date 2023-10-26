package Silver.Silver4;


import java.util.Scanner;

import static java.lang.Math.max;

public class BJ24418 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] m = new int[n][n];
        for (int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                m[i][j] = sc.nextInt();
            }
        }

        System.out.println(matrix_path2(m, n));
    }

    public static int matrix_path(int[][] m, int n, int k) {  // (1, 1)에서 (n, n)에 이르는 최고 점수를 구한다.
        return matrix_path_rec(m, n, k);
    }
    public static int matrix_path_rec(int[][] m, int i, int j) {  // (1, 1)에서 (i, j)에 이르는 최고 점수를 구한다.
        if (i == 0 || j == 0)
            return 0;
        else
            return (m[i][j] + (max(matrix_path(m, i-1, j), matrix_path(m, i, j-1))));
    }

    //행렬 경로 문제 동적 프로그래밍
    public static int matrix_path2(int m[][], int n) {  // (1, 1)에서 (n, n)에 이르는 최고 점수를 구한다.
        int[][]d = new int[n][n];

        for (int i = 0; i <= n; i++) {
            d[i][0] = 0;
        }
        for (int j = 1; j < n; j++) {
            d[0][j] =0;
        }

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                d[i][j] = m[i][j] + max(d[i - 1][j], d[i][j - 1]);
            }
        }
        return d[n][n];
    }

}
