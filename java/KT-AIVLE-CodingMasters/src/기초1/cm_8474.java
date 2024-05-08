package 기초1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class cm_8474 {
    //8474. 가장 큰 나머지
    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //N입력
        int N = Integer.parseInt(br.readLine());

        int remain1 = N % 5;
        int remain2 = N % 7;

        if(remain1 > remain2)
            System.out.println(remain1);
        else
            System.out.println(remain2);
    }

}
