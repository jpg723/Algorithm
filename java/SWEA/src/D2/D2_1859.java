package D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D2_1859 {

    /*https://swexpertacademy.com/main/code/problem/problemDetail.do?problemLevel=2&contestProbId=AV5LrsUaDxcDFAXc&categoryId=AV5LrsUaDxcDFAXc&categoryType=CODE&problemTitle=&orderBy=RECOMMEND_COUNT&selectCodeLang=ALL&select-1=2&pageSize=10&pageIndex=1*/

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine()); //테스트케이스 수
        long[] profit = new long[T]; //이익

        for(int i = 0; i < T; i++){
            int N = Integer.parseInt(br.readLine());
            int[] price = new int[N]; //매매가

            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for(int j = 0; j < N; j++){
                price[j] = Integer.parseInt(st.nextToken()); //매매가 입력
            }

            int max = price[N - 1];
            for(int j = N - 2; j >= 0; j--){

                if(max > price[j])
                    profit[i] += max - price[j];
                else
                    max = price[j];
            }
        }

        //결과 출력
        for(int i = 0; i < T; i++){
            System.out.println("#" + (i + 1) + " " + profit[i]);
        }

    }
}
