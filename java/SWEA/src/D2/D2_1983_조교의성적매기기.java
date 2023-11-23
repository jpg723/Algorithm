package D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class D2_1983_조교의성적매기기  {
    /*
    https://swexpertacademy.com/main/code/problem/problemDetail.do?problemLevel=2&contestProbId=AV5PwGK6AcIDFAUq&categoryId=AV5PwGK6AcIDFAUq&categoryType=CODE&problemTitle=&orderBy=RECOMMEND_COUNT&selectCodeLang=ALL&select-1=2&pageSize=10&pageIndex=2
    조교의 성적 매기기
     */
    public static void main(String args[])throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st  = new StringTokenizer(br.readLine(), " ");
            int N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());
            double[] score = new double[N];

            for(int j = 0; j < N; j++){
                st  = new StringTokenizer(br.readLine(), " ");
                int middleScore = Integer.parseInt(st.nextToken());
                int finalScore = Integer.parseInt(st.nextToken());
                int assign = Integer.parseInt(st.nextToken());

                score[j] = Math.round((middleScore * 0.35 + finalScore * 0.45 + assign * 0.2)*100)/100.0;
                //System.out.println(score[j]);
            }

            System.out.println();

            for(int j = 0; j < N; j++){
                for(int k = j + 1; k < N; k++) {
                    if (score[j] < score[k]) {
                        double temp = 0;
                        temp = score[j];
                        score[j] = score[k];
                        score[k] = temp;
                    }
                    else
                        break;
                }
            }

            for(int j = 0; j < N; j++){
                System.out.println(score[j]);
            }
        }
    }
}
