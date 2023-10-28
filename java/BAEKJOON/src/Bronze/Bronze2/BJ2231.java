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
        int M = 0;

        for(int i = 1; i <= N; i++){

            String n = String.valueOf(i);
            int num  = i;
            int sum = 0;

            if(n.length() == 1){
                sum = 2 * num;
            }

            else {
                sum = i;
                for (int j = 0; j < n.length(); j++) {
                    sum += num % 10;
                    num = num / 10;
                }
            }

            if(N == sum){
                M = i;
                break;
            }
        }

        System.out.println(M);
    }
}
