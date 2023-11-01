package Silver.Silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ2839 {
    /*https://www.acmicpc.net/problem/2839*/
    public static void main(String args[]) throws IOException{
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int cnt = 0;
        int result = -1;

        for(int i = 0; i <= 5000; i++){
            for(int j = 0; j <= 5000; j++){
                cnt = (i * 5) + (j * 3);

                if(cnt == N) {
                    result = i + j;
                    break;
                }
            }
        }

        System.out.println(result);
    }
}
