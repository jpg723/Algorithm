package 초급2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class cm_8670 {
    //8670. 전투력

    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 용병의 수(N)입력
        int N = Integer.parseInt(br.readLine());

        int[] K = new int[N]; // 전투력 저장 배열

        // 전투력(K)입력
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < N; i++){
            K[i] = Integer.parseInt(st.nextToken());
        }

        // 오름차순 정렬
        Arrays.sort(K);
        
        int[] power = new int[N]; // 전투력 합 저장 배열

        // 전투력 합 구하기
        for(int i = 0; i < N; i++){
            for(int j = i; j < N; j++){
                power[i] += K[i];
            }
        }

        // 최대 전투력 찾기
        int max = 0;
        for (int i = 0; i < N; i++) {
            max = Math.max(max, power[i]);
        }

        // 결과 출력
        System.out.println(max);
    }
}
