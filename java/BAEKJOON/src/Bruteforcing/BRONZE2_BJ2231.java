package Bruteforcing;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BRONZE2_BJ2231 {
    /*
        https://www.acmicpc.net/problem/2231
        분해합
     */
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int sum = 0;
        int result = 0;

        for(int i = 1; i <= 1000000; i++){

            //문자열로 변환
            String stringNum = String.valueOf(i);
            //각 자리 수 더하기
            for(int j = 0; j < stringNum.length(); j++){
                char charNum = stringNum.charAt(j);
                int intNum = Character.getNumericValue(charNum);
                sum += intNum;
            }

            //생성자 더하기
            sum += i;

            //sum이 N이면 i는 N의 생성자
            if(sum == N) {
                result = i;
                break;
            }
            else
                sum = 0;
        }

        //결과 출력
        System.out.println(result);
    }
}
