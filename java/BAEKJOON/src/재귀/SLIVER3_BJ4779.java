package 재귀;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SLIVER3_BJ4779 {
    /*https://www.acmicpc.net/problem/4779
    칸토어집합
     */
    static StringBuilder sb;
    public static void main(String args[])throws NullPointerException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String n;
        while ((n = br.readLine()) != null) {

            int N = Integer.parseInt(n);
            sb = new StringBuilder();
            int length = (int)Math.pow(3, N);

            char[] str = new char[length];

            for (int i = 0; i < length; i++) {
                sb.append("-");
            }

            mergeSort(str, 0, length);

            System.out.println(sb);
        }
    }

    public static void mergeSort(char s[], int p, int r){

        if(r == 1)
            return;

        else{
            //3등분한 문자열의 두 번째 부분 공백처리
            int q = r / 3;
            for(int i = (p + q); i < p + 2 * q; i++){
                sb.setCharAt(i, ' ');
            }

            mergeSort(s, p, q);
            mergeSort(s, (p + 2 * q), q);
        }
    }
}
