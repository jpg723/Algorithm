package D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D2_1858_백만장자프로젝트 {
    /*
    https://swexpertacademy.com/main/code/problem/problemDetail.do?problemLevel=2&contestProbId=AV5LrsUaDxcDFAXc&categoryId=AV5LrsUaDxcDFAXc&categoryType=CODE&problemTitle=&orderBy=INQUERY_COUNT&selectCodeLang=ALL&select-1=2&pageSize=10&pageIndex=1&&&&&&&&&&
    백만장자 프로젝트
     */
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //T입력
        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++){
            //N입력
            int N = Integer.parseInt(br.readLine());

            //매매가 입력
            int[] price = new int[N];
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            for(int j = 0; j < N; j++){
                price[j] = Integer.parseInt(st.nextToken());
            }

            int max = 0;
            long profit = 0;
            for(int j = N - 1; j >= 0; j--){
                if(max < price[j]) {
                    max = price[j];
                }
                else {
                    profit += (max - price[j]);
                }
            }

            System.out.println("#" + (i + 1) + " " + profit);
        }
    }
}
