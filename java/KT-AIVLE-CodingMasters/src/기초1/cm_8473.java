package 기초1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class cm_8473 {
    //8473. 아이디 만들기
    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String id = br.readLine();

        boolean check = false;

        if(id.length() > 20)
            System.out.println("I");

        else{
            for(int i = 0; i < id.length(); i++){

                char c_id = id.charAt(i);

                if(c_id < 'A' || c_id > 'z'){
                    check = true;
                    break;
                }
            }

            if(check)
                System.out.println("I");
            else
                System.out.println("P");
        }
    }
}
