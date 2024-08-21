package 초급1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class cm_8504 {
    //8504. 설거지 담당
    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        String result = "";

        if(N == 1 || N == 3 || N == 5 || N == 7)
            result = "RUN";

        else
            result = "STAY";

        System.out.println(result);

    }
}
