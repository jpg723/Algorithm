package D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

import static sun.swing.MenuItemLayoutHelper.max;

public class D2_1204 {
    /*https://swexpertacademy.com/main/code/problem/problemDetail.do?problemLevel=2&contestProbId=AV13zo1KAAACFAYh&categoryId=AV13zo1KAAACFAYh&categoryType=CODE&problemTitle=&orderBy=RECOMMEND_COUNT&selectCodeLang=ALL&select-1=2&pageSize=10&pageIndex=1*/
    public static void main(String args[]) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++){
            int testcase_num = Integer.parseInt(br.readLine());
            int[] score = new int[1000];
            int[] count_max = new int[101];

            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            //점수 입력 받기
            for(int j = 0; j < 1000; j++){
                score[j] = Integer.parseInt(st.nextToken());
            }

            for(int j = 0; j < 1000; j++){
                count_max[score[j]] += 1;
            }

            int max = 0;
            int index = 0;
            for(int j = 0; j < 100; j++){
                if(max <= count_max[j]) {
                    max = count_max[j];
                    index = j;
                }
            }

            System.out.println("#" + testcase_num + " " + index);
        }
    }

}
