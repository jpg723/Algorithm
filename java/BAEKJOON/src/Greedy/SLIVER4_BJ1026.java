package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class SLIVER4_BJ1026 {
    /*https://www.acmicpc.net/problem/1026
        보물
     */
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //N입력
        int N = Integer.parseInt(br.readLine());

        int[] A = new int[N];
        int[] B = new int[N];

        //A입력
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < N; i++){
            A[i] = Integer.parseInt(st.nextToken());
        }

        //B입력
        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < N; i++){
            B[i] = Integer.parseInt(st.nextToken());
        }

        //A와 B오름차순으로 정렬
        Arrays.sort(A);
        Arrays.sort(B);

        //S구하기
        int S = 0;
        for(int i = 0; i < N; i++){
            //A는 오름차순, B는 내림차순 순서대로 곱해줌
            S += (A[i] * B[N-1-i]);
        }

        //결과출력
        System.out.println(S);
    }
}
