package Silver.Silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class BJ1018 {
    /*체크판 다시 칠하기
    https://www.acmicpc.net/problem/1018
    */

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        //N, M입력
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        String[][] BW = new String[N][M];
        String[] temp = new String[N];

        //체스판 입력 받기
        for (int i = 0; i < N; i++) {
            temp[i] = br.readLine();
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                BW[i][j] = String.valueOf(temp[i].charAt(j));
            }
        }

        int[] color_change = new int[N*M];
        int cnt = 0;
        int row = 0;
        int col = 0;

        while (true) {

            for(int k = 0; k < N - 7; k++) {
                for (int i = col; i < 8 + col; i++) {
                    for (int j = row; j < 7 + row; j++) {
                        if (BW[i][j].equals(BW[i][j + 1])) {
                            color_change[cnt] += 1;
                            j++;
                        }
                    }
                }
                col++;
                cnt++;
            }

            if (M - row == 8)
                break;

            else {
                row++;
                col = 0;
            }
        }

        int min = N * M;

        for(int i = 0; i < cnt; i++){
            if(min > color_change[i])
                min = color_change[i];
        }

        System.out.println(min);

    }
}
