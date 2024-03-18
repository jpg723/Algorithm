package 초급;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class cm_8512 {
    //8512. 예비군 훈련

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        // 연차, 군별, 동원지정여부, 신분
        int annual = Integer.parseInt(st.nextToken());
        String military = st.nextToken();
        String check = st.nextToken();
        String identity = st.nextToken();

        //훈련시간
        int time = 0;

        // 신분이 병인 경우
        if(identity.equals("Private")){

            if(annual >= 1 && annual <= 4 && check.equals("N")){
                //1~4년차 동원미지정 공군
                if(military.equals("ROKAF"))
                    time = 28;
                //1~4년차 동원미지정 육·해군
                else
                    time = 32;
            }

            // 1~4년차 동원지정 육·해·공군
            else if(annual >= 1 && annual <= 4 && check.equals("Y")){
                time = 28;
            }

            else if(annual >= 5 && annual <= 6 && check.equals("N")){
                time = 20;
            }
        }

        // 신분이 간부인 경우
        else{

            // 1~6년차 동원미지정 육·해·공군 및 1~6년차 동원지정 육·해·공군
            if(check.equals("N") || check.equals("Y")){
                if(annual >= 1 && annual <= 6)
                    time = 28;
            }
        }

        System.out.println(time);
    }
}
