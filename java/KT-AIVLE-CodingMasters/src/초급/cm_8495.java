package 초급;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class cm_8495 {
    //8495. 누적 합
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // N입력
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        // K입력
        ArrayList<Integer> K = new ArrayList<>();
        for(int i = 0; i < N; i++){
            K.add(Integer.parseInt(st.nextToken()));
        }

        int length = 1; // 초기 이진트리 크기
        int size = 1; //트리의 높이

        // 초기 이진트리 크기 구하기
        while(true){

            //length = 입력된 K의 개수와 가장 가까운 2의 제곱수
            if(K.size() <= length)
                break;
            length *= 2;
            size++;
        }

        // 길이가 1인 경우
        if(length == 1)
            System.out.println(K.get(0));

        // 길이가 2이상인 경우
        else {

            // 원소가 부족한 경우 0으로 채움
            for (int i = 0; i < length - N; i++) {
                K.add(0);
            }

            // 누적 합 계산
            int index = 0;
            while (true) {

                // 위로 올라가면서 길이는 2로 나눈 만큼 짧아진다.
                length /= 2;

                // 누적합을 구하면서 K배열에 넣어준다.
                for (int j = 0; j < length; j++) {
                    int sum = K.get(index) + K.get(index + 1);
                    K.add(sum);
                    index += 2;
                }
                
                // length가 1이면 누적합 완료
                if (length == 1)
                    break;
            }

            // 결과 출력
            int start = K.size();
            
            // 트리의 높이만큼 반복
            for (int i = 0; i < size; i++) {

                // K배열에 저장된 원소를 거꾸로 출력
                for (int j = start - 1; j < start - 1 + length; j++)
                    System.out.print(K.get(j) + " ");

                System.out.println();
                // 길이는 내려가면서 2의 제곱만큼 늘어남
                length *= 2;
                start -= length;
            }
        }
    }
}
