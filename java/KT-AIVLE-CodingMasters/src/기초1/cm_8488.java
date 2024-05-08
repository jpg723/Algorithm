package 기초1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class cm_8488 {
    //8488. 소수 구하기

    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        boolean check = false;
        int count = 0;

        for(int i = 2; i < N; i++){
            for(int j = 2; j < i; j++){
                if(i % j == 0) {
                    check = true;
                    break;
                }
            }

            if(!check)
                count++;
            check = false;
        }

        System.out.println(count);
    }
}
