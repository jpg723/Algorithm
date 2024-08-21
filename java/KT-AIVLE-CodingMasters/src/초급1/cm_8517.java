package 초급1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class cm_8517 {
    //8517. 피보나치 피보나치 수열

    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        //a, b입력
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int[] fibofibo = new int[100];
        int index = 0;
        int num = 1;

        // 피보나치 피보나치 수열 만들기
        while(true){
            int temp = fibo(num);

            for(int i = 0; i < temp; i++){
                fibofibo[index] = temp;
                index++;

                if(index == 100)
                    break;
            }

            if(index == 100)
                break;

            num++;
        }

        int sum = 0;

        for(int i = a; i <= b; i++){
            sum += fibofibo[i - 1];
        }

        System.out.println(sum);

    }

    public static int fibo(int n){

        if(n == 1 || n == 2)
            return 1;

        else
            return fibo(n - 2) + fibo(n - 1);
    }
}
