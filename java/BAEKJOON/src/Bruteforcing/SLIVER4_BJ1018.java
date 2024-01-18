package Bruteforcing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class SLIVER4_BJ1018 {
    /*
        https://www.acmicpc.net/problem/1018
        체스판 다시 칠하기
     */
    static String [][] chess;
    static ArrayList<Integer> result = new ArrayList<>();
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        //N과 M입력
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        //체스판 입력
        String[] arr = new String[N];

        for(int i = 0; i < N; i++){
            arr[i] = br.readLine();
        }

        chess = new String[N][M];

        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++) {
                char charArr = arr[i].charAt(j);
                chess[i][j] = String.valueOf(charArr);
            }
        }

        for(int col = 0; col <= (N - 8); col++) {
            for(int row = 0; row <= (M - 8); row++) {
                find(col, row);
            }
        }

        System.out.println(Collections.min(result));

    }
    public static void find(int col, int row){

        int count1 = 0;
        int count2 = 0;
        
        String check = chess[col][row];

        for (int i = col; i < col + 8; i++) {
            for (int j = row; j < row + 8; j++) {
                if(chess[i][j].equals(check)){
                    count2++;
                    if(chess[i][j].equals("W")){
                        check = "B";
                    }
                    else{
                        check = "W";
                    }
                }
                else{
                    count1++;
                    if(chess[i][j].equals("W")){
                        check = "W";
                    }
                    else{
                        check = "B";
                    }
                }
            }
            if(check.equals("W")){
                check = "B";
            }
            else{
                check = "W";
            }
        }

        result.add(count1);
        result.add(count2);
    }
}