package 백트래킹;

import java.io.*;
import java.util.StringTokenizer;

public class GOLD4_BJ2580 {
    /*https://www.acmicpc.net/problem/2580
    스도쿠
     */

    public static int[][]arr = new int[9][9];
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for(int i = 0; i < 9; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for(int j = 0; j < 9; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dfs(0, 0);

    }

    public static void dfs(int row, int col) throws IOException{

        int temp = 0;

        if(col == 9){
            dfs(row + 1, 0);
            return;
        }

        if (row == 9) {

            for(int i = 0; i < 9; i++){

                for(int j = 0; j < 9; j++){
                    bw.write(String.valueOf(arr[i][j]) + " ");
                }
                bw.write("\n");
            }
            bw.flush();
            return;
        }

        if (arr[row][col] == 0) {
            for (int i = 0; i < 9; i++) {

                if (possible(row, col, i + 1) == true) {
                    arr[row][col] = i + 1;
                    dfs(row, col + 1);
                }
            }
            arr[row][col] = 0;
            return;
        }

        dfs(row, col + 1);
    }

    public static boolean possible(int row, int col, int num){

        //열 중복 검사
        for(int i = 0; i < row; i++){
            if(arr[row][i] == num)
                return false;
        }

        //행 중복 검사
        for(int i = 0; i < col; i++){
            if(arr[i][col] == num)
                return false;
        }

        // 3*3 칸에 중복되는 원소가 있는지 검사
        int set_row = (row / 3) * 3;	// value가 속한 3x3의 행의 첫 위치
        int set_col = (col / 3) * 3;	// value가 속한 3x3의 열의 첫 위치

        for (int i = set_row; i < set_row + 3; i++) {
            for (int j = set_col; j < set_col + 3; j++) {
                if (arr[i][j] == num) {
                    return false;
                }
            }
        }

        return true;
    }
}
