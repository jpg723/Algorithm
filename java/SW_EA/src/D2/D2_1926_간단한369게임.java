package D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D2_1926_간단한369게임 {
    /*https://swexpertacademy.com/main/code/problem/problemDetail.do?problemLevel=2&contestProbId=AV5PTeo6AHUDFAUq&categoryId=AV5PTeo6AHUDFAUq&categoryType=CODE&problemTitle=&orderBy=RECOMMEND_COUNT&selectCodeLang=ALL&select-1=2&pageSize=10&pageIndex=1
    간단한 369게임
     */
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int cnt = 0;
        for(int i = 0; i < N; i++){
            cnt = i + 1;

            //숫자를 문자로 변환
            String num = String.valueOf(cnt);

            int check = 0; //3, 6, 9가 포함되어 있는 개수
            for(int j = 0; j < num.length(); j++){
                //3, 6, 9가 포함되어 있는 개수 세기
                if(num.charAt(j) == '3' || num.charAt(j) == '6' || num.charAt(j) == '9') {
                    check++;
                }
            }
            //3, 6, 9가 포함되어 있는 개수만큼 -출력
            if(check != 0){
                for(int j = 0; j < check; j++)
                    System.out.print("-");
                System.out.print(" ");
            }

            //아니면 숫자 그대로 출력
            else if(check == 0)
                System.out.print(num + " ");
        }
    }
}
