package Bruteforcing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SLIVER5_BJ1436 {
    /*https://www.acmicpc.net/problem/1436
        영화감독 숌
     */
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int series = 666;
        String stringSeries = "";
        int cnt = 0;

        while(true){

            stringSeries = String.valueOf(series);

            if(stringSeries.contains("666"))
                cnt++;

            if(cnt == N)
                break;

            series++;
        }

        System.out.println(series);
    }
}
