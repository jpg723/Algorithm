package CodingTestPre;

import java.io.IOException;

public class CodingTestPre2 {
    public static void main(String[] args)throws IOException{
        int [][]arr = {{5, 4, 8, 7}, {7, 3, 1, 2}, {3, 8, 12, 6}, {11, 4, 5, 4}};

        int [][]result = solution(arr, 4);

        for(int i = 0; i < result.length; i++){
            for(int j = 0; j < result[0].length; j++){
                System.out.print(result[i][j]);
            }
            System.out.println();
        }
    }

    public static int[][] solution(int[][] arr, int k) {
        int row = arr[0].length; // 세로 길이
        int col = arr.length; // 가로 길이
        int[][] answer = new int[row][col];

        for(int i = 0; i < k; i++) {
            int r_index = 0;
            int c_index = 0;

            if (col >= row) {
                col = col / 2;
                answer = new int[row][col];

                for (int r = 0; r < row; r++) {
                    for (int c = 0; c < col + 1; c += 2) {
                        if (arr[r][c] >= arr[r][c + 1]) {
                            answer[r_index][c_index] = arr[r][c];
                        } else {
                            answer[r_index][c_index] = arr[r][c + 1];
                        }
                        c_index++;
                    }
                    r_index++;
                    c_index = 0;
                }
            }

            else {
                row = row / 2;
                answer = new int[row][col];

                for (int r = 0; r < row + 1; r += 2) {
                    for (int c = 0; c < col; c++) {
                        if (arr[r][c] <= arr[r + 1][c]) {
                            answer[r_index][c_index] = arr[r][c];
                        } else {
                            answer[r_index][c_index] = arr[r + 1][c];
                        }
                        c_index++;
                    }
                    r_index++;
                    c_index = 0;
                }
            }

            arr = answer;

        }
        return answer;
    }
}
