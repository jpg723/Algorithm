package 대기업코테유형;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class SLIVER5_BJ8979 {
    /*https://www.acmicpc.net/problem/8979
    올림픽
     */
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[][] medal = new int[N][4];

        //메달 입력
        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine(), " ");
            for(int j = 0; j < 4; j++)
                medal[i][j] = Integer.parseInt(st.nextToken());
        }

        //내림차순 정렬
        Arrays.sort(medal, (o1, o2) -> {

            if(o1[1] == o2[1]) {
                if(o1[2] == o2[2])
                    return o2[3] - o1[3];
                return o2[2] - o2[1];
            }

            return o2[1] - o1[1]; // 오름차순 정렬
        });

        for(int i = 0; i < N; i++){
            for(int j = 0; j < 4; j++){
                System.out.println(medal[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        int rank = 1;
        for(int i = 0; i < N; i++){

            if(medal[i][0] == K)
                break;
            else
                rank++;
        }

        System.out.println(rank);
    }
}
