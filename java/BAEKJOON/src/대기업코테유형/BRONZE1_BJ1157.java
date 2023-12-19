package 대기업코테유형;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BRONZE1_BJ1157 {
    /*https://www.acmicpc.net/problem/1157
    단어공부
     */
    public static void main(String args[])throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] alp = new char[26];
        int[] cnt = new int[26];
        String str = br.readLine();
        char[] s = new char[str.length()];

        //대문자로 변환
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
                s[i] = (char) (str.charAt(i) - 32);
            else
                s[i] = str.charAt(i);
        }

        //알파벳 배열 생성
        for(int i = 0; i < 26; i++) {
            alp[i] = (char) ('A' + i);
        }

        //알파벳 개수 count
        for(int i = 0; i < str.length(); i++){
            for(int j = 0; j < 26; j++){
                if(alp[j] == s[i]) {
                    cnt[j]++;
                }
            }
        }

        //가장 많이 나온 횟수 검사
        int max = 0;
        int index = 0;
        for(int i = 0; i < 26; i++){
            if(max < cnt[i]) {
                max = cnt[i];
                index = i;
            }
        }

        //최대값이 여러 개인지 검사
        int check = 0;
        for(int i = 0; i < 26; i++){
            if(cnt[i] == max)
                check++;
        }

        //결과 출력
        if(check == 1)
            System.out.println(alp[index]);
        else
            System.out.println("?");
    }

}
