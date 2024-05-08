package 초급2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class cm_8690 {
    //8690. 방향 추적

    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // N입력
        int N = Integer.parseInt(br.readLine());

        int[] y = new int[N];
        int[] x = new int[N];

        // 움직인 위치 입력
        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            y[i] = Integer.parseInt(st.nextToken());
            x[i] = Integer.parseInt(st.nextToken());
        }

        int[] D = new int[N-1];
        int[] X = new int[N-1];
        
        for(int i = 0; i < N - 1; i++){

            // y축으로의 움직임이 0인 경우 (=x축으로만 움직인 경우)
            if((y[i + 1] - y[i]) == 0){
                if ((x[i + 1] - x[i]) > 0)
                    D[i] = 2; // 동쪽
                else
                    D[i] = 4; // 서쪽

                // x축으로 움직인 거리를 절댓값으로 계산
                X[i] = Math.abs(x[i + 1] - x[i]);
            }
            // y축으로 움직인 경우
            else {
                if ((y[i + 1] - y[i]) > 0)
                    D[i] = 1; // 북쪽
                else
                    D[i] = 3; // 남쪽

                // y축으로 움직인 거리를 절댓값으로 계산
                X[i] = Math.abs(y[i + 1] - y[i]);
            }
        }

        for(int i = 0; i < N-1; i++){
            System.out.println(D[i] + " " + X[i]);
        }

    }
}
