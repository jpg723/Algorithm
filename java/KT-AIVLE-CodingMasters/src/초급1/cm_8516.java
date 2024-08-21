package 초급1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class cm_8516 {
    //8516. 문서 통계

    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String doc = br.readLine();

        //공백 포함 글자 수
        int count1 = doc.length();

        int count2 = 0; //공백 제외 글자 수
        int count3 = 0; //단어 수
        
        for(int i = 1; i < doc.length(); i++){

            char alp = doc.charAt(i);

            if(alp >= 'A' && alp <= 'z') {
                count2++;
            }

            //공백 앞에 문자가 있으면 단어로 인식
            if(alp == ' ') {
                char temp = doc.charAt(i - 1);
                if (temp >= 'A' && temp <= 'z')
                    count3++;
            }
        }

        System.out.println(count1);
        // 맨 앞은 공백이 올 수 없으므로 맨 앞 문자 개수 추가
        System.out.println(count2 + 1);
        // 맨 뒤는 공백이 올 수 없으므로 맨 뒤 문자 개수 추가
        System.out.println(count3 + 1);
    }
}
