package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class SLIVER1_BJ1931 {
    /*
        https://www.acmicpc.net/problem/1931
        회의실 배정
     */

    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //N입력
        int N = Integer.parseInt(br.readLine());

        int[][] time = new int[N][2];
        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            time[i][0] = Integer.parseInt(st.nextToken()); //시작시간
            time[i][1] = Integer.parseInt(st.nextToken()); //끝나는 시간
        }

        //시작시간을 기준으로 내림차순 정렬
        Arrays.sort(time, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {

                //시작시간이 같은 경우 마감시간이 큰 회의시간을 앞에 배치
                if(o2[0] == o1[0])
                    return o2[1]-o1[1];

                return o2[0]-o1[0];
            }
        });

        int start = time[0][0];
        int cnt = 1;

        for(int i = 1; i < N; i++) {
            if ((start - time[i][1]) >= 0) {
                start = time[i][0];
                cnt++;
            }
        }

        //결과출력
        System.out.print(cnt);
    }

}
