package 초급1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class cm_8505 {
    //8505. 이별 30분 전

    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int H = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        if(H == 0)
            H = 24;

        if(M >= 30)
            M = M - 30;

        else{
            H = H - 1;
            M = 30 + M;
        }

        System.out.println(H + " " + M);



    }
}
