package Lv2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class lv2_최댓값과최솟값 {
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        System.out.println(solution(str));
    }

    public static String solution(String s) {
        String answer = "";

        String[] c = s.split(" ");

        int[] arr = new int[c.length];

        for(int i = 0; i < c.length; i++){
            arr[i] = Integer.parseInt(c[i]);
        }

        int max = -9999999;
        for(int i = 0; i < c.length; i++){
            if(max < arr[i])
                max = arr[i];
        }

        int min = 9999999;
        for(int i = 0; i < c.length; i++){
            if(min > arr[i])
                min = arr[i];
        }

        answer = Integer.toString(min) + " " + Integer.toString(max);
        return answer;
    }

}
