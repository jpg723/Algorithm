package 초급;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class cm_8502 {
    //8502. N을 보는 시각

    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int count = 0; // 숫자 N의 등장 횟수를 저장할 변수

        // 시간 범위 내의 시, 분, 초를 모두 순회
        for (int hour = 0; hour < 24; hour++) {
            for (int minute = 0; minute < 60; minute++) {
                for (int second = 0; second < 60; second++) {
                    // 각 시간 단위에서 숫자 N이 포함되어 있는지 확인
                    if (containsNumber(hour, N) || containsNumber(minute, N) || containsNumber(second, N)) {
                        count++; // 숫자 N이 포함되어 있다면 count를 증가시킴
                    }
                }
            }
        }

        System.out.println(count);
    }

    // 해당 숫자가 포함되어 있는지 확인하는 메서드
    public static boolean containsNumber(int value, int N) {
        // value를 문자열로 변환하여 해당 문자열에 숫자 N이 포함되어 있는지 확인
        return String.valueOf(value).contains(String.valueOf(N));
    }
}
