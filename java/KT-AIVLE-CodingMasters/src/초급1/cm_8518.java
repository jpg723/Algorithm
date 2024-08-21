package 초급1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class cm_8518 {
    //8518. 직각 삼각형

    public static void main(String[]args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int[] length = new int[3];

        for(int i = 0; i < 3; i++){
            length[i] = Integer.parseInt(st.nextToken());
        }

        //최대 길이 구하기
        int max = 0;
        for(int i = 0; i < 3; i++){
            if(length[i] > max)
                max = length[i];
        }

        int cal1 = max * max;
        int cal2 = 0;

        for(int i = 0; i < 3; i++){
            if(max != length[i]){
                int temp = length[i] * length[i];
                cal2 += temp;
            }
        }

        if(cal1 == cal2)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
