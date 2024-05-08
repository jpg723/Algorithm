package 기초1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class cm_8476 {
    //8476. 자녀의 키는

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int height1 = Integer.parseInt(st.nextToken());
        int height2 = Integer.parseInt(st.nextToken());

        int result = (height1 + height2) / 2;

        System.out.println(result);

    }
}
