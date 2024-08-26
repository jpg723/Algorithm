package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SLIVER3_13305 {
    /*https://www.acmicpc.net/problem/13305
    주유소
     */

    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //도시의 개수 입력
        int N = Integer.parseInt(br.readLine());

        //도로의 길이 입력
        long[] length = new long[N - 1];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < N - 1; i++){
            length[i] = Long.parseLong(st.nextToken());
        }

        //리터당 가격 입력
        long[] price = new long[N];
        
        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < N; i++){
            price[i] = Long.parseLong(st.nextToken());
        }

        long result = 0;
        int end = 0;
        int start = 0;
        long sum = 0;

        for(int i = 0; i < N; i++){

            for(int j = start + 1; j < N; j++){
                if(price[start] >= price[j]) {
                    end = j;
                    break;
                }
            }

            //System.out.println("end: " + end);
            //System.out.println("start: " + start);

            sum = 0;
            for(int j = start; j < end; j++){
                sum += length[j];
            }

            //System.out.println("sum: " + sum);

            result += price[start] * sum;
            //System.out.println("result: " + result);
            start = end;
            //System.out.println("============================");
        }

        System.out.println(result);
    }
}
