package 기초;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class cm_8471 {
    //8471. 8진수와 16진수
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //N입력
        int N = Integer.parseInt(br.readLine());

        //8진수 변환
        int devide = N; //몫
        int[] remain8 = new int[N]; //8진수
        int index = 0;
        while(devide != 0){

            remain8[index] = devide % 8;
            devide = devide / 8;
            index++;
        }

        //거꾸로 출력
        for(int i = index - 1; i >= 0; i--){
            System.out.print(remain8[i]);
        }

        System.out.print(" ");

        //16진수 변환
        devide = N; //몫 초기화
        String[] remain16 = new String[N]; //16진수
        int remain = 0;
        index = 0; //index 초기화
        char alp = 'A';

        while(devide != 0) {

            remain = devide % 16;
            devide = devide / 16;

            if(remain < 10){
                remain16[index] = Integer.toString(remain);
                index++;
            }

            else{
                for(int i = 10; i <= 15; i++){
                    if(i == remain) {
                        remain16[index] = Character.toString(alp);
                        index++;
                        alp = 'A'; // 초기화
                        break;
                    }
                    else
                        alp = (char)(alp + 1);
                }
            }
        }

        //거꾸로 출력
        for(int i = index - 1; i >= 0; i--){
            System.out.print(remain16[i]);
        }
    }
}
