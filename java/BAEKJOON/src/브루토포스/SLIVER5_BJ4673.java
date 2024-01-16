package 브루토포스;

import java.io.IOException;
import java.util.ArrayList;

public class SLIVER5_BJ4673 {
    /*
        https://www.acmicpc.net/problem/4673
        셀프 넘버
     */
    public static void main(String[] args)throws IOException{

        ArrayList<Integer> arr = new ArrayList<>();

        for(int i = 1; i <= 10000; i++){
            //숫자를 문자열로 변환
            String num = String.valueOf(i);
            int sum = 0;

            //각 자리수 구하기
            for(int j = 0; j < num.length(); j++){
                //문자열을 문자로 하나씩 자르기
                char charNum = num.charAt(j);
                //자른 문자를 문자열로 변환하여 숫자로 다시 바꾸기
                int intNum = Integer.parseInt(String.valueOf(charNum));

                //각 자리 수의 합 구하기
                sum += intNum;
            }
            //생성자와 각 자리 수의 합을 arr에 넣기
            arr.add(sum + i);

        }

        for(int i = 1; i <= 10000; i++){
            boolean check = false;

            for(int j = 0; j < 10000; j++) {
                //arr에 있는 숫자는 셀프 넘버가 아니므로
                if (arr.get(j) == i)
                    check = true;
            }

            //셀프 넘버가 아닌 경우 다시 반복문 시작, 셀프 넘버인 경우에만 출력
            if(check)
                continue;
            else
                System.out.println(i);
        }
    }
}
