package Graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class SLIVER1_BJ2667 {
    //https://www.acmicpc.net/problem/2667
    // 단지번호 붙이기

    static int[][] arr;
    static boolean[][] check;
    static int[] dx = {-1, 1, 0, 0}; //상하좌우
    static int[] dy = {0, 0, -1, 1}; //상하좌우
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // N입력
        int N = Integer.parseInt(br.readLine());

        arr = new int[N][N];
        check = new boolean[N][N];

        // 배열 입력
        for(int i = 0; i < N; i++){
            String str = br.readLine();

            for(int j = 0; j < N; j++){
                char ch = str.charAt(j);
                arr[i][j] = (int)ch - 48;
            }
        }

        int count = 0; // 단지 개수
        ArrayList<Integer> apartArr = new ArrayList<>(); // 단지 내 집 개수 저장 배열
        
        for(int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                // 배열 중에서 1이면서 방문하지 않았으면 단지 개수 증가하고 bfs로 단지 내 집 개수 구하기
                if (arr[i][j] == 1 && !check[i][j]) {
                    count++;
                    apartArr.add(bfs(N, i, j));
                }
            }
        }

        // 최종 집의 개수를 저장할 배열
        int[] result = new int[count];

        // result배열에 옮겨 담기
        for(int i = 0; i < count; i++){
            result[i] = apartArr.get(i);
        }
        // 오름차순 정렬
        Arrays.sort(result);

        // 결과 출력
        System.out.println(count);
        for(int i = 0; i < count; i++){
            System.out.println(result[i]);
        }

    }

    public static int bfs(int n, int x, int y){
        int apartCount = 1;
        Queue<int[]> q = new LinkedList<>();

        q.add(new int[]{x, y});
        check[x][y] = true;

        while(!q.isEmpty()){
            int now[] = q.poll();
            int nowX = now[0];
            int nowY = now[1];

            for(int i = 0; i < 4; i++){
                int nextX = nowX + dx[i];
                int nextY = nowY + dy[i];

                // 배열을 벗어난 경우
                if(nextX < 0 || nextX >= n || nextY < 0 || nextY >= n) {
                    continue;
                }

                // 이동하려는 단지가 이미 방문했거나 0인 경우
                if(check[nextX][nextY] || arr[nextX][nextY] == 0) {
                    continue;
                }

                q.add(new int[]{nextX, nextY});
                arr[nextX][nextY] = arr[nowX][nowY] + 1;
                check[nextX][nextY] = true;
                apartCount++;
            }
        }
        return apartCount;
    }
}
