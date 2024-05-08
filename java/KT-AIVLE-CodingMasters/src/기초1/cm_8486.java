package 기초1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class cm_8486 {

    //8486. 원의 넓이
    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int R = Integer.parseInt(br.readLine());

        double result = R * R * 3.14;

        //소수점이 없다면 정수형으로 변환
        if(isInteger(result))
            System.out.println((int)result);
        else
            System.out.println(result);
    }

    //소수점이 없으면 정수로 변환하는 함수
    public static boolean isInteger(double num) {
        return num == (int) num;
    }
}
