
package Bruteforcing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class BRONZE2_BJ2798 {
    /*
        https://www.acmicpc.net/problem/2798
        블랙잭
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        //N, M입력
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] card = new int[N];

        //카드 입력
        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < N; i++){
            card[i] = Integer.parseInt(st.nextToken());
        }

        ArrayList<Integer> result = new ArrayList<>();

        for(int i = 0; i < N; i++){
            int sum = 0;
            for(int j = i + 1; j < N; j++){
                for(int k = j + 1; k < N; k++){

                    sum = card[i] + card[j] + card[k];

                    if(sum > M){
                        continue;
                    }

                    else{
                        result.add(sum);
                    }
                }
            }
        }

        //오름차순 정렬
        Collections.sort(result);

        //결과 출력
        System.out.println(result.get(result.size() - 1));
    }
}
