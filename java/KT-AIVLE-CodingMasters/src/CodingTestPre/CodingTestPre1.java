package CodingTestPre;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodingTestPre1 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 문자열 입력
        String str = br.readLine();

        System.out.println(solution(str));
    }

    public static String solution(String str) {
        // 알파벳 배열 생성
        char[] alp = new char[26];
        for(int i = 0; i < 26; i++){
            alp[i] = (char)('A' + i);
        }

        // 문자열 시작
        char start = str.charAt(0);
        // 동일한 문자를 세는 cnt배열 변수
        int[] cnt = new int[str.length()];
        // 첫 번째로 시작할 cnt값(초기값)
        cnt[0] = 1;
        // cnt배열의 index값
        int index = 0;
        // 동일한 문자를 세는 반복문
        for(int i = 1; i < str.length(); i++){

            char c = str.charAt(i);

            if(start != c){
                index++;
                cnt[index] = 1;
                start = c;
            }

            else{
                cnt[index]++;
            }
        }

        // 결과 출력
        StringBuilder result= new StringBuilder();
        result.append(start);
        for(int i = 0; i < index + 1; i++){
            for(int j = 0; j < alp.length; j++){
                if(cnt[i] == j + 1){
                    result.append(alp[j]);
                }
            }
        }


        return result.toString();
    }
}

