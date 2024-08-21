package 초급1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class cm_8493 {
    //8493. 사전 만들기

    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        String[] word = new String[N];

        for(int i = 0; i < N; i++){
            word[i] = br.readLine();
        }

        Arrays.sort(word, new Comparator<String>() {
            public int compare(String s1, String s2) {
                // 단어 길이가 같을 경우
                if (s1.length() == s2.length()) {
                    return s1.compareTo(s2);
                }
                // 그 외의 경우
                else {
                    return s1.length() - s2.length();
                }
            }
        });

        System.out.println(word[0]);
        for (int i = 1; i < N; i++) {
            // 중복되지 않는 단어만 출력
            if (!word[i].equals(word[i - 1])) {
                System.out.println(word[i]);
            }
        }
    }
}
