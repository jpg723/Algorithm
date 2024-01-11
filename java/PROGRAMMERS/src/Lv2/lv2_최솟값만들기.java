package Lv2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class lv2_최솟값만들기 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] a = {1, 4, 2};
        int[] b = {5, 4, 4};


        solution(a, b);
        //System.out.println("\"" + solution(str) + "\"");
    }

    public static int solution(int []A, int []B)
    {
        int answer = 0;

        int length = 1;

        for(int i = 0; i < A.length; i++)
            length *= A.length;

        int[] result = new int[length];

        for(int i = 0; i < A.length; i++){
            
        }

        return answer;
    }

}
