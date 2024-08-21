package 중급1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class cm_8537 {
    //8537. 콩벌레

    static int[] dx = {0, 1, 0, -1}; // 동, 남, 서, 북
    static int[] dy = {1, 0, -1, 0}; // 동, 남, 서, 북
    static int[][] turn = {{2, 3}, {3, 2}, {1, 0}, {0, 1}}; // 반시계, 시계

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //지도
        int[][] map = new int[10][10];

        // 콩벌레 시작 위치
        int x = -1;
        int y = -1;

        // 지도 정보 입력
        for (int i = 0; i < 10; i++) {
            String line = br.readLine();
            for (int j = 0; j < 10; j++) {
                map[i][j] = line.charAt(j) - '0';

                // 시작 위치
                if (map[i][j] == 2) {
                    x = i;
                    y = j;
                    break;
                }
            }

            if (x != -1)
                break;
        }

        System.out.println("시작위치:" + x + " " + y);

        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};

        boolean turnState = false;

        // 콩벌레 시작 방향 설정 (북쪽)
        int direction = 0;

        // 콩벌레의 이동
        while (true) {
            // 콩벌레가 이동할 위치 계산
            int nx = x + dx[direction];
            int ny = y + dy[direction];
            System.out.println("현재위치: " + x + " " + y);
            System.out.println("다음위치: " + nx + " " + ny);


            // 다음 위치가 지도를 벗어나는지 확인
            if (nx < 0 || nx >= 10 || ny < 0 || ny >= 10) {
                System.out.println("yes");
                break;
            }

            // 장애물을 만나면 방향 변경
            if (map[nx][ny] == 1) {
                System.out.println("방향 전환");
                System.out.print(direction + "-> ");

                //반시계 방향으로
                if(turnState) {
                    direction = -1;
                    turnState = false;
                }
                //시계 방향으로
                else {
                    direction = 0;
                    turnState = true;
                }

                System.out.println(direction);
                System.out.println("============");
            }

            else if(map[nx][ny] == 0){
                // 다음 위치로 이동
                x = nx;
                y = ny;
            }
        }
    }
}
