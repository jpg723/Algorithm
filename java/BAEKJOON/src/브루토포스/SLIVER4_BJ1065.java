package 브루토포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class SLIVER4_BJ1065 {
    /*https://www.acmicpc.net/problem/1065
        한수
     */
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //변수 설정
        ArrayList<Integer> arr = new ArrayList<>();
        int count = 0;

        //N입력
        int N = Integer.parseInt(br.readLine());

        for(int i = 1; i <= N; i++){
            //문자열로 변환
            String num = String.valueOf(i);

            for(int j = 0; j < num.length(); j++){
                //문자열을 하나씩 문자로 자르기
                char charNum = num.charAt(j);
                //문자를 int로 변환
                int intNum = Character.getNumericValue(charNum);
                //arr배열에 각 자리 수를 추가
                arr.add(intNum);
            }

            //등차수열인지 판별하는 변수 설정
            boolean check = false;
            for(int j = 0; j < arr.size() - 2; j++){
                //등차수열인지 판별(등차수열이 아니면 check를 true로 변환)
                if(arr.get(j) - arr.get(j + 1) != arr.get(j + 1) - arr.get(j + 2)){
                    check = true;
                }
            }

            //arr초기화
            arr.clear();

            //한수가 아니면(check = true) 반복문 처음으로 이동, 한수면 count증가
            if(check){
                continue;
            }

            else {
                count++;
            }

        }

        //결과 출력
        System.out.println(count);
    }
}
