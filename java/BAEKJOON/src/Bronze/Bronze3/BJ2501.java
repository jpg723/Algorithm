package Bronze.Bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ2501 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken()); //n입력
        int k = Integer.parseInt(st.nextToken()); //k입력

        int[] arr = new int[n]; //약수를 담는 배열
        int cnt = -1; //약수의 개수

        for(int i = 0; i < n ; i++){
            if(n % (i + 1) == 0){ //약수 판별
                cnt++; //약수의 개수 증가
                arr[cnt] = i + 1; //약수를 찾아 arr에 넣기
            }
        }

        if(cnt + 1 < k)  //약수의 개수가 k개보다 적은 경우
            System.out.println(0);

        else
            System.out.println(arr[k-1]);
    }
}
