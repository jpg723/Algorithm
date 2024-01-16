package 브루토포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class SLIVER5_BJ4676 {
    /*
        https://www.acmicpc.net/problem/4673
        셀프 넘버
     */
    public static void main(String[] args)throws IOException{

        ArrayList<Integer> arr = new ArrayList<>();

        for(int i = 1; i <= 10000; i++){
            String num = String.valueOf(i);
            int sum = 0;
            for(int j = 0; j < num.length(); j++){
                char charNum = num.charAt(j);
                int intNum = Integer.parseInt(String.valueOf(charNum));
                //System.out.print(intNum + " + ");
                sum += intNum;
            }
            arr.add(sum + i);
            //System.out.print(" + " + i + " = " + (sum + i) + "\n");
        }

        for(int i = 1; i <= 10000; i++){
            boolean check = false;

            for(int j = 0; j < 10000; j++) {
                if (arr.get(j) == i)
                    check = true;
            }

            if(check)
                continue;
            else
                System.out.println(i);
        }
    }
}
