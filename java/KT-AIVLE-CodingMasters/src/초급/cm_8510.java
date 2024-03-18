package 초급;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class cm_8510 {
    //8510. 구간 단속

    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int length = Integer.parseInt(br.readLine());
        int log = Integer.parseInt(br.readLine());

        String[] carNum1 = new String[log];
        String[] carNum2 = new String[log];
        String[] start = new String[log];
        String[] end = new String[log];

        // 출발한 로그와 시간 입력
        for(int i = 0; i < log; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            carNum1[i] = st.nextToken();
            start[i] = st.nextToken();
        }

        // 도착한 로그와 시간 입력
        for(int i = 0; i < log; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            carNum2[i] = st.nextToken();
            end[i] = st.nextToken();
        }

        int[] startTime = new int[log];
        int[] endTime = new int[log];
        
        // 출발, 도착 시간 초로 변환
        for(int i = 0; i < log; i++){
            String[] startTimeParts = start[i].split(":");
            String[] endTimeParts = end[i].split(":");

            int startH = Integer.parseInt(startTimeParts[0]);
            int startM = Integer.parseInt(startTimeParts[1]);
            int startS = Integer.parseInt(startTimeParts[2]);

            int endH = Integer.parseInt(endTimeParts[0]);
            int endM = Integer.parseInt(endTimeParts[1]);
            int endS = Integer.parseInt(endTimeParts[2]);

            startTime[i] = (startH * 3600) + (startM * 60) + startS;
            endTime[i] = (endH * 3600) + (endM * 60) + endS;
        }

        int[] passTime = new int[log];
        // 구간을 통과하는데 걸린 시간
        for(int i = 0; i < log; i++){
            for(int j = 0; j < log; j++){
                if(carNum1[i].equals(carNum2[j])){

                    passTime[i] = endTime[j] - startTime[i];
                }
            }
        }

        String[] result = new String[log];
        // 속력 구하기
        for(int i = 0; i < log; i++){
            double speed = ((double) length / passTime[i]) * 3600; // 미터/시간 단위로 속력 계산
            result[i] = String.format("%.0f", speed);
        }

        // 버블 정렬을 사용하여 문자열 배열을 오름차순으로 정렬
        for (int i = 0; i < carNum1.length - 1; i++) {
            for (int j = 0; j < carNum1.length - 1 - i; j++) {
                if (carNum1[j].compareTo(carNum1[j + 1]) > 0) {
                    // 문자열을 비교하여 정렬
                    String temp1 = carNum1[j];
                    String temp2 = result[j];
                    carNum1[j] = carNum1[j + 1];
                    result[j] = result[j + 1];
                    carNum1[j + 1] = temp1;
                    result[j + 1] = temp2;
                }
            }
        }

        // 정렬된 문자열 배열 출력
        for(int i = 0; i < log; i++){
            System.out.println(carNum1[i] + " " + result[i]);
        }
    }
}
