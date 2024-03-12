package 초급;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class cm_8496 {
    //8496. 중앙 값

    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int[] K = new int[5];

        for(int i = 0; i < 5; i++){
            K[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(K);

        System.out.println(K[5/2]);
    }
}
