package 초급;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class cm_8514 {

    //8514. 오리 농법
    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 밭의 크기 입력
        int N = Integer.parseInt(br.readLine());

        // 밭의 상태 입력
        int[][] field = new int[N][N];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                field[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 가로로 잡초 없애기(가로줄에 1이 있으면 잡초 못 없앰)
        boolean check = false;
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                // 작물이 있는 가로줄인지 확인
                if(field[i][j] == 1) {
                    check = true;
                    break;
                }
            }

            // 작물이 없는 가로줄이면 잡초 없애기
            if(!check){
                for(int j = 0; j < N; j++){
                    if(field[i][j] == 2)
                        field[i][j] = 0;
                }
            }
            check = false;
        }

        // 세로로 잡초 없애기(세로줄에 1이 있으면 잡초 못 없앰)
        check = false;
        for(int i = 0; i < N; i++){

            for(int j = 0; j < N; j++){
                // 작물이 있는 세로줄인지 확인
                if(field[j][i] == 1) {
                    check = true;
                    break;
                }
            }

            // 작물이 없는 세로줄이면 잡초 없애기
            if(!check){
                for(int j = 0; j < N; j++){
                    if(field[j][i] == 2)
                        field[j][i] = 0;
                }
            }
            check = false;
        }

        // 남아있는 잡초 개수 세기
        int count = 0;
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                if(field[i][j] == 2)
                    count++;
            }
        }

        // 결과 출력
        System.out.println(count);
    }
}
