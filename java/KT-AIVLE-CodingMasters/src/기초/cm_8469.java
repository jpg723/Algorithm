package 기초;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class cm_8469 {

    //8469. 비밀번호 찾기
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String pw = br.readLine();
        char[] result = new char[pw.length()];

        int index = 0;

        for(int i = 0; i < pw.length(); i++){
            char c_pw = pw.charAt(i);

            if(c_pw == 'c')
                break;

            else {
                result[index] = c_pw;
                index++;
            }
        }

        for(int i = 0; i < index; i++){
            System.out.print(result[i]);
        }
        System.out.print('c');
    }
}
