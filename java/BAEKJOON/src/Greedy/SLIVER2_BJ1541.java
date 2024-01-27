package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class SLIVER2_BJ1541 {
    /*https://www.acmicpc.net/problem/1541
        잃어버린 괄호
     */
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int add = 0;
        int result = 0;
        //식 입력
        String formula = br.readLine();

        //마이너스를 기준으로 자르기
        String[] splitMinus = formula.split("-");

        for(int i = 0; i < splitMinus.length; i++){

            //플러스 기준으로 자르기
            String[] splitPlus = splitMinus[i].split("\\+");

            //플러스로 자른 값들 더하기
            for(int j = 0; j < splitPlus.length; j++)
                add += Integer.parseInt(splitPlus[j]);

            if(i == 0)
                result = add;
            else{
                result -= add;
            }
            add = 0;
        }

        System.out.println(result);

    }
}
