package 브루토포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ1436 {
    /*https://www.acmicpc.net/problem/1436
    * 영화감독 숌
    * */
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int series = 666;
        int cnt = 0;

        while(true) {

            if (String.valueOf(series).contains("666")) {
                cnt++;

                if (cnt == N)
                    break;
            }

            series++;
        }

        System.out.println(series);
    }
}
