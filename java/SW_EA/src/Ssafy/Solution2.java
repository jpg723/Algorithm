package Ssafy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution2 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //T 입력
        int T = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int[] score = new int[N];

        //점수 입력
        st = new StringTokenizer(br.readLine(), " ");
        for(int j = 0; j < N; j++){
            score[j] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(score);
        int max = score[N - 1];
        int min = score[0];
        int[] middle = new int[N];
        int index = 0;

        for(int j = 0; j < N; j++){

            if(max == score[j] || min == score[j]){
                continue;
            }
            else
                middle[index++] = score[j];
        }

        for(int j = 0; j < index; j++){
            if(index < B || index == B)
                break;
            else
                index--;
        }

        System.out.println(index);
    }
}
