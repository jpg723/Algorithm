package Bronze.Bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*https://www.acmicpc.net/problem/2231*/
public class BJ2231 {
    public static void main(String [] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int M = 0; //n+n의 분해합의 합

        for(int i = 1; i <= N; i++){

            int Nlength = String.valueOf(i).length(); //N의 자리수
            int num  = i;
            int sum = num;

            for (int j = 0; j < Nlength; j++) { //num의 분해합
                sum += num % 10;
                num = num / 10;
            }

            if(N == sum){ //num+num의 분해합이 N과 같으면 종료
                M = i;
                break;
            }
        }

        System.out.println(M);
    }
}
