package 초급;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class cm_8509 {
    //8509. 커트라인 정하기

    public static void main(String [] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] score = new int[N];

        // 점수 입력하기
        st = new StringTokenizer(br.readLine()," ");
        for(int i = 0; i < N; i++){
            score[i] = Integer.parseInt(st.nextToken());
        }

        // 커트라인 정하기(겹치는 커트라인 제거)
        ArrayList<Integer> cutLine = new ArrayList<>();
        boolean check = false;
        for(int i = 0; i < N; i++){

            check = false;
            for(int j = 0; j < cutLine.size(); j++){
                if(score[i] == cutLine.get(j))
                    check = true;
            }

            if(!check)
                cutLine.add(score[i]);
        }

        // 최소 점수 구하기(커트라인을 정할 수 없는 경우 대비)
        int min = 999;
        for (int i : score) {
            min = Math.min(min, i);
        }

        ArrayList<Integer> cnt = new ArrayList<>();
        ArrayList<Integer> resultCutLine = new ArrayList<>();
        int count = 0;
        for(int i = 0; i < cutLine.size(); i++){

            // 합격한 학생수 카운트하기
            for(int j = 0; j < N; j++) {
                if (cutLine.get(i) <= score[j]){
                    count++;
                }

                else{
                    if(j == 0){
                        if(score[j + 1] >= cutLine.get(i))
                            count++;
                    }

                    else if(j == N - 1) {
                        if(score[j - 1] >= cutLine.get(i))
                            count++;
                    }

                    else{
                        if(score[j - 1] >= cutLine.get(i) || score[j + 1] >= cutLine.get(i))
                            count++;
                    }
                }
            }

            if(count <= K){
                cnt.add(count);
                resultCutLine.add(cutLine.get(i));
            }

            count = 0;
        }

        // 최대값 구하기
        int max_index = 0;
        int max = 0;
        for(int i = 0; i < cnt.size(); i++){
            if(max < cnt.get(i)) {
                max = cnt.get(i);
                max_index = i;
            }

            else if(max == cnt.get(i)){
                if(resultCutLine.get(i) > resultCutLine.get(max_index)){
                    max = cnt.get(i);
                    max_index = i;
                }
            }
        }

        if(max == 0)
            System.out.println(min - 1);
        else
            System.out.println(resultCutLine.get(max_index));
    }
}
