package 기초;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class cm_8475 {
    //8475. 1등급 한우
    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(br.readLine());

        char grade = ' ';

        if (A >= 200)
            grade = 'A';

        else if (A >= 180)
            grade = 'B';

        else if (A >= 150)
            grade = 'C';

        else
            grade = 'D';

        System.out.println(grade);
    }
}
