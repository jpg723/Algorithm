package Ssafy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution1 {
    public static void main(String args[]) throws IOException {
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));

        //T입력
        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++){
            //N입력
            int N = Integer.parseInt(br.readLine());
            int[] price = new int[N];
            boolean[] visit = new boolean[N];

            //visit 초기화
            for(int j = 0; j < N; j++){
                visit[j] = false;
            }

            //가격 입력
            long sum = 0;
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for(int j = 0; j < N; j++){
                price[j] = Integer.parseInt(st.nextToken());
                sum += price[j];
            }

            //오름차순 정렬
            Arrays.sort(price);

            int start = N - 1;
            for(int j = N - 1; j >= 0; j--){

                for(int k = N - 2; k >= 0; k--) {

                    if (visit[k] == false && visit[j] == false) {
                        if(price[j] > price[k]) {
                            sum = sum - price[k];
                            visit[k] = true;
                            visit[start] = true;
                            break;
                        }
                    }
                }
            }

            System.out.println("#" + (i + 1) + " " + sum);
        }
    }
}
