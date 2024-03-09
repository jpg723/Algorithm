package 기초;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class cm_8477 {
    //8477. 삼각형의 조건

    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int[] angle = new int[3]; //세 각(a, b, c)
        int sum = 0; //세 각의 합
        boolean check = false;

        //각 입력, 세 각의 합 구하기
        for(int i = 0; i < angle.length; i++){
            angle[i] = Integer.parseInt(st.nextToken());
            sum += angle[i];
        }

        if(sum == 180) {

            for (int i = 0; i < angle.length; i++) {

                if (angle[i] < 0) {
                    check = true;
                    break;
                }
            }
        }

        else
            check = true;

        //결과출력
        if(check)
            System.out.println("F");
        else
            System.out.println("P");
    }
}
