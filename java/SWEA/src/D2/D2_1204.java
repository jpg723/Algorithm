package D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D2_1204 {
    public static void main(String args[]) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++){
            int testcase_num = Integer.parseInt(br.readLine());
            int[] score = new int[5];
            int[] count_max = new int[5];

            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            for(int j = 0; j < 5; j++){
                score[j] = Integer.parseInt(st.nextToken());
            }

            for(int j = 0; j < 5; j++){
                for(int k = 0; k < 5; k++){
                    if(score[j] == score[k])
                        count_max[j]++;
                }
            }

            for(int j = 0; j < 5; j++){
                System.out.println(score[j] + ": " + count_max[j]);
            }


        }
    }
}
