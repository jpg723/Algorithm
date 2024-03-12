package 초급;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class cm_8507 {
    //8507. 주사위의 합

    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] dice = {1, 2, 3, 4, 5, 6};

        for(int i = 0; i < 6; i++){

            for(int j = 0; j < 6; j++){

                if(dice[i] + dice[j] == N) {
                    System.out.println(dice[i] + " " + dice[j]);
                    break;
                }
            }
        }
    }
}
