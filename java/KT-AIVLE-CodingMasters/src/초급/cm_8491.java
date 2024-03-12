package 초급;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class cm_8491 {
    //8491. 정렬된 많은 원소 사이에서 특정 원소 찾기

    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int A = Integer.parseInt(st.nextToken());

        int[] K = new int[N];
        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < N; i++){
            K[i] = Integer.parseInt(st.nextToken());
        }

        int result = -1;
        for(int i = 0; i < N; i++){
            if(K[i] == A)
                result = i + 1;
        }

        System.out.println(result);

    }
}
