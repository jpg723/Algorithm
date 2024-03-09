package 기초;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class cm_8479 {
    //8479. 림보게임
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] height = new int[N];
        boolean pass = false;
        int result = 0;

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < N; i++){
            height[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < N; i++){
            if(height[i] <= 160) {
                pass = true;
                result = height[i];
                break;
            }
        }

        if(pass)
            System.out.print("I " + result);
        else
            System.out.print("P");
    }
}
