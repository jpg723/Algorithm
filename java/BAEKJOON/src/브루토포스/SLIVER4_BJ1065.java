package 브루토포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class SLIVER4_BJ1065 {
    /*https://www.acmicpc.net/problem/1065
        한수
     */
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer> arr = new ArrayList<>();

        int count = 0;

        for(int i = 1; i <= N; i++){
            String num = String.valueOf(i);

            for(int j = 0; j < num.length(); j++){
                char charNum = num.charAt(j);
                int intNum = Character.getNumericValue(charNum);
                arr.add(intNum);
            }

            boolean check = false;
            for(int j = 0; j < arr.size() - 2; j++){

                if(arr.get(j) - arr.get(j + 1) != arr.get(j + 1) - arr.get(j + 2)){
                    check = true;
                }
            }

            arr.clear();
            if(check){
                continue;
            }
            else {
                count++;
            }

        }
        System.out.println(count);


    }
}
