package 기초1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class cm_8487 {
    //8487. 최대공약수

    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        ArrayList<Integer> list_N = new ArrayList<>();
        ArrayList<Integer> list_M = new ArrayList<>();
        
        //N의 약수 구하기
        for(int i = 1; i <= N; i++){
            if(N % i == 0)
                list_N.add(i);
        }

        //M의 약수 구하기
        for(int i = 1; i <= M; i++){
            if(M % i == 0)
                list_M.add(i);
        }

        int result = 0;

        for(int i = list_N.size() - 1; i >= 0; i--){
            for(int j = list_M.size() - 1; j >= 0; j--){
                if(list_N.get(i) == list_M.get(j)) {
                    result = list_N.get(i);
                    break;
                }
            }

            if(result != 0)
                break;
        }

        System.out.println(result);
    }
}
