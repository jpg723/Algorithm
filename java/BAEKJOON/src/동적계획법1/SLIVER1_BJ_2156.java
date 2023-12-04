package 동적계획법1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SLIVER1_BJ_2156 {
    /*https://www.acmicpc.net/problem/2156
    포도주 시식
     */
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //포도주 잔의 개수
        int n = Integer.parseInt(br.readLine());

        //포도주 양
        int[] size = new int[n];

        for(int i = 0; i < n ; i++){
            size[i] = Integer.parseInt(br.readLine());
        }

    }
    public static int sum(int n, int[] size) {
        int[] f = new int[n];

        f[0] = 1;
        f[1] = 1;

        for (int i = 2; i < n; i++) {
            f[i] = f[i - 1] + f[i - 2];
        }
        return f[n - 1];
    }
}
