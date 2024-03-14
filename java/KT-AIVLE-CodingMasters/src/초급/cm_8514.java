package 초급;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class cm_8514 {

    //8514. 오리 농법
    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[][] ground = new int[N][N];
        int[][] count = new int[N][3];

        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for(int j = 0 ; j < N; j++){
                ground[i][j] = Integer.parseInt(st.nextToken());

                if(ground[i][j] == 0)
                    count[i][0]++;

                else if(ground[i][j] == 1)
                    count[i][1]++;

                else
                    count[i][2]++;
            }
        }

        for(int i = 0; i < N; i++){

            for(int j = 0 ; j < 3; j++){
                System.out.print(count[i][j]);

            }

            System.out.println();
        }
    }
}
