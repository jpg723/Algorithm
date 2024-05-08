package 기초1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class cm_8483 {
    //8483. You
    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String A = br.readLine();

        if(A.equals("You"))
            System.out.println("Me");
        else
            System.out.println("No");
    }
}
