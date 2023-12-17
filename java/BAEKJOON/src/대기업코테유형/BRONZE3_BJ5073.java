package 대기업코테유형;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BRONZE3_BJ5073 {
    /*https://www.acmicpc.net/problem/5073
    삼각형과 세 변
     */
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[3];
        while(true){
            int end = 0;
            //길이 입력
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for(int i = 0; i < 3; i++){
                arr[i] = Integer.parseInt(st.nextToken());

                if(arr[i] == 0)
                    end++;
            }

            //0이 세 번 입력 되면 종료
            if(end == 3)
                break;

            //정렬
            Arrays.sort(arr);

            if(arr[2] >= arr[0] + arr[1]) {
                System.out.println("Invalid");
            }else if(arr[0] == arr[1] && arr[1] == arr[2]) {
                System.out.println("Equilateral");
            }else if(arr[0] == arr[1] || arr[1] == arr[2] || arr[0] == arr[2]) {
                System.out.println("Isosceles");
            }else {
                System.out.println("Scalene");
            }
        }
    }
}
