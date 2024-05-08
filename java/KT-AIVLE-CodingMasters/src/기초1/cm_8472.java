package 기초1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class cm_8472 {
    //8472. 아스키 코드
    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //A입력
        int A = Integer.parseInt(br.readLine());

        System.out.println((char)(A));
    }
}
