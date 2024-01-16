package 브루토포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SLIVER5_BJ4676 {
    /*
        https://www.acmicpc.net/problem/4673
        셀프 넘버
     */
    public static void main(String[] args)throws IOException{

        for(int i = 10; i <= 10000; i++){
            String num = String.valueOf(i);
            int sum = 0;
            for(int j = 0; j < num.length(); j++){
                char charNum = num.charAt(j);

                int intNum = Integer.parseInt(String.valueOf(charNum));
                sum += intNum;
            }
            System.out.println(sum);
        }
    }
}
