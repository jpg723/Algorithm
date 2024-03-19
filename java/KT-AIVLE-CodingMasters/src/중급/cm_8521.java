package 중급;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class cm_8521 {
    //8521. 효율적인 화폐 구성

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] value = new int[N];

        // 가치 입력
        for(int i = 0; i < N; i++){
            value[i] = Integer.parseInt(br.readLine());
        }

        // 오름차순 정리
        Arrays.sort(value);

        int count = 0;

        for(int i = N - 1; i >= 0; i--){

            count += M / value[i];
            M = M % value[i];
        }

        if(M == 0)
            System.out.println(count);
        else
            System.out.println(-1);
    }
}
