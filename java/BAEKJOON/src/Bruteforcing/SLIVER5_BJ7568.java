package Bruteforcing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SLIVER5_BJ7568 {
    /*
        https://www.acmicpc.net/problem/7568
        덩치
     */
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //N입력
        int N = Integer.parseInt(br.readLine());

        //몸무게, 키, 등수 변수 설정
        int[] weight = new int[N];
        int[] height = new int[N];
        int[] rank = new int[N];

        //키, 몸무게 입력
        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            weight[i] = Integer.parseInt(st.nextToken());
            height[i] = Integer.parseInt(st.nextToken());
        }

        //등수 설정
        for(int i = 0; i < N; i++){
            rank[i]++;
            for(int j = 0; j < N; j++){
                if(weight[i] < weight[j] && height[i] < height[j])
                    rank[i]++;
            }
        }

        //결과 출력
        for(int i = 0; i < N; i++){
            System.out.print(rank[i] + " ");
        }
    }
}
