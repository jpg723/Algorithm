package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SLIVER4_BJ2217 {
    /*
        https://www.acmicpc.net/problem/2217
        로프
     */
     public static void main(String[] args)throws IOException{
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

         //N입력
         int N = Integer.parseInt(br.readLine());

         int[] weight = new int[N];

         //최대 중량 입력
         for(int i = 0; i < N; i++){
             weight[i] = Integer.parseInt(br.readLine());
         }

         Arrays.sort(weight);

         int k = 0;
         for(int i = 0; i < N; i++){

             if(k < weight[i] * (N - i))
                 k = weight[i] * (N - i);
         }

         System.out.println(k);
     }
}
