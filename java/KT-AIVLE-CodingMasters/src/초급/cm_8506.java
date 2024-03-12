package 초급;

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

            System.out.print(star);
            System.out.println();

            for(int j = 0; j < i + 1; j++) {
                System.out.print(" ");
            }
        }
    }
}
