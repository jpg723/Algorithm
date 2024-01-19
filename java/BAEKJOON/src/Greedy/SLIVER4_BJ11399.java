package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class SLIVER4_BJ11399 {
    /*
        https://www.acmicpc.net/problem/11399
        ATM
     */
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N =  Integer.parseInt(br.readLine());

        int[] P = new int[N];
        int time = 0;

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for(int i = 0; i < N; i++){
            P[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(P);

        for(int i = 0; i < N; i++){

            for(int j = 0; j < i + 1; j++)
                time += P[j];
        }

        System.out.println(time);

    }

}
