package D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D2_1954_달팽이숫자 {
    /*
    https://swexpertacademy.com/main/code/problem/problemDetail.do?problemLevel=2&contestProbId=AV5PobmqAPoDFAUq&categoryId=AV5PobmqAPoDFAUq&categoryType=CODE&problemTitle=&orderBy=RECOMMEND_COUNT&selectCodeLang=ALL&select-1=2&pageSize=10&pageIndex=1
    달팽이 숫자
     */
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //오,하,좌,상 순서로 방향배열 만들기
        int[] dx={0,1,0,-1};
        int[] dy={1,0,-1,0};

        //T입력
        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++) {
            //N입력
            int N = Integer.parseInt(br.readLine());

            int[][] arr = new int[N][N]; //달팽이 배열
            boolean[][] visit = new boolean[N][N]; //방문 확인 배열

            int dir = 0;
            int x = 0;
            int y = 0;

            for(int j = 0; j < N * N; j++){
                arr[x][y] = j + 1;
                visit[x][y] = true;

                //다음칸 갈수있는지 확인하기
                int nextx = x + dx[dir];
                int nexty = y + dy[dir];

                //방향바꾸기 조건 : 1.범위를 넘어갈때  , 2. 다음칸이 채워져있을때
                if(nextx >= N || nexty >= N || nextx < 0 || nexty < 0 || visit[nextx][nexty] == true ) {
                    dir = (dir + 1) % 4; //방향전환
                }
                //다음칸 지정
                x = x + dx[dir];
                y = y + dy[dir];
            }

            //출력하기
            System.out.println("#" + (i + 1));
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < N; k++) {
                    System.out.print(arr[j][k] + " ");
                }
                System.out.println();
            }

        }
    }

}
