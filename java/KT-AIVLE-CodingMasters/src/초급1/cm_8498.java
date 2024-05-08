package 초급1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class cm_8498 {
    // 8498. 두더지 게임

    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] check = {
                {0, 1, 0, 1, 0, 1, 0, 1},
                {1, 0, 1, 0, 1, 0, 1, 0},
                {0, 1, 0, 1, 0, 1, 0, 1},
                {1, 0, 1, 0, 1, 0, 1, 0},
                {0, 1, 0, 1, 0, 1, 0, 1},
                {1, 0, 1, 0, 1, 0, 1, 0},
                {0, 1, 0, 1, 0, 1, 0, 1},
                {1, 0, 1, 0, 1, 0, 1, 0}
        };

        char[][] game = new char[8][8];

        // T, F 입력
        for(int i = 0; i < 8; i++){
            String line = br.readLine();
            
            for(int j = 0; j < 8; j++){
                game[i][j] = line.charAt(j);
            }
        }

        int count = 0;
        for(int i = 0; i < 8; i++){

            for(int j = 0; j < 8; j++){

                if(game[i][j] == 'F' && check[i][j] == 0)
                    count++;
            }
        }

        System.out.println(count);

    }
}
