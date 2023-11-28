package 재귀;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GOLD5_BJ11729 {
    /*https://www.acmicpc.net/problem/11729
    하노이 탑 이동 순서
     */
    static int K  = 0;
    public static void main(String args[])throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        hanoi(N, 1, 2, 3);
        System.out.println(K);
    }

    public static void hanoi(int n, int start, int sub, int end){
        if(n == 1) {
            System.out.println(start + " " + end);
            return;
        }

        else{
            hanoi(n - 1, start, end, sub);
            System.out.println(start + " " + end);
            K++;
            hanoi(n - 1, start, end, sub);
        }
    }
}
