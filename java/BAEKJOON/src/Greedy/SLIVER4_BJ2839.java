package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SLIVER4_BJ2839 {
    /*
        https://www.acmicpc.net/problem/2839
        설탕배달
     */
    public static void main (String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int count = 0;

        while(true){

            if(N <= 0)
                break;

            if(N % 5 > N % 3){
                N -= 3;
                count++;
            }

            else
             {
                N -= 5;
                count++;
            }
        }

        if (N < 0)
            count = -1;

        System.out.println(count);
    }
}
