package 초급1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class cm_8506 {
    //8506. 구름 별

    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String star = "**";

        for(int i = 0; i < N; i++){

            for(int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            System.out.print(star);
            System.out.println();
        }
    }
}
