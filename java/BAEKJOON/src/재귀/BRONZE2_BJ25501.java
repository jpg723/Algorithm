package 재귀;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BRONZE2_BJ25501 {
    /*https://www.acmicpc.net/problem/25501
    재귀의 귀재
     */

    static int cnt = 0; //재귀 개수
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //T입력
        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++) {
            //문자열 입력
            String str = br.readLine();
            char[] s = new char[str.length()];

            //문자열 문자 배열로 변환
            for(int j = 0; j < str.length(); j++){
                s[j] = str.charAt(j);
            }
            //재귀 개수 초기화
            cnt = 0;
            //출력
            System.out.println(isPalindrome(s, str.length()) + " " + cnt);
        }
    }

    public static int recursion(char[] s, int l, int r) {
        //재귀 횟수 카운트
        cnt++;

        if (l >= r)
            return 1;
        else if (s[l] != s[r])
            return 0;

        else
            return recursion(s, l + 1, r - 1);
    }

    public static int isPalindrome(char[] s, int length) {
        return recursion(s, 0, (length - 1));
    }
}
