package 초급1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class cm_8499 {
    //8499. 몇 번씩 나올까

    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        char[] arr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        int[] count = new int[10];

        for(int i = 1; i <= N; i++){

            String s_index = String.valueOf(i); // 문자열 변환

            for(int j = 0; j < s_index.length(); j++){

                char c_index = s_index.charAt(j);
                for(int k = 0; k < arr.length; k++){

                    if(c_index == arr[k])
                        count[k]++;
                }
            }
        }

        for(int i = 0; i < 10; i++){
            System.out.print(count[i] + " ");
        }
    }
}
