package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SLIVER5_BJ1789 {
    /*https://www.acmicpc.net/problem/1789
        수들의 합
     */
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long S = Long.parseLong(br.readLine());

        long sum = 0;
        long i = 1;
        long cnt = 0;

        while(true){

            sum += i;

            if(sum > S)
                break;
            i++;
            cnt++;
        }

        System.out.println(cnt);
    }
}
