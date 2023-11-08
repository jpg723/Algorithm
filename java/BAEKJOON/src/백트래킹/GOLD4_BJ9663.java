package 백트래킹;

import java.io.*;

public class GOLD4_BJ9663 {
    /*
    * https://www.acmicpc.net/problem/9663
    * N-Queen
    * */

    public static int[] arr;
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        arr = new int[N];

        dfs(N, 0);
        bw.write(count);
        bw.flush();
    }
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static int count = 0;

    public static void dfs(int n, int depth) throws IOException{

        if(n == depth){
            count++;
            return;
        }

        else{
            for(int i = 0; i < n; i++){
                arr[depth] = i;

                if (Possibility(depth)) {
                    dfs(n, depth + 1);
                }
            }
        }
    }
    public static boolean Possibility(int col) {

        for (int i = 0; i < col; i++) {
            // 해당 열의 행과 i열의 행이 일치할경우 (같은 행에 존재할 경우)
            if (arr[col] == arr[i]) {
                return false;
            }

            /*
             * 대각선상에 놓여있는 경우
             * (열의 차와 행의 차가 같을 경우가 대각선에 놓여있는 경우다)
             */
            else if (Math.abs(col - i) == Math.abs(arr[col] - arr[i])) {
                return false;
            }
        }

        return true;
    }
}
