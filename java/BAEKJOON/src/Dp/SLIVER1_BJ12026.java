package Dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SLIVER1_BJ12026 {
    //https://www.acmicpc.net/problem/12026
    // BOJ 거리
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();

        int[] block = new int[N];

        for(int i = 0; i < N; i++){
            block[i] = str.charAt(i);
        }



    }
}
