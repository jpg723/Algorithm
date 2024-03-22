package 초급;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class cm_8501 {
    //8501. 배수 만들기

    public static void main(String[] args)throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        ArrayList<Integer> K = new ArrayList<>();

        // K입력
        int sum = 0;
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken();
            K.add(num);
        }

        // 오름차순 정렬
        Collections.sort(K);

        // 300의 배수가 되려면 3의 배수인 동시에 100의 배수여야 한다.
        // 100의 배수는 뒤가 0 두 개로 끝나면 됨
        // 1000일 때 고려해서 K[2]는 0이 되면 안 됨
        boolean check100 = false;
        if (K[0] == 0 && K[1] == 0)
            check100 = true;

        if (check100) {
            if (sum % 3 == 0) {
                for (int i = N - 1; i >= 0; i--) {
                    System.out.print(K[i]);
                }
            }
        } else
            System.out.print("-1");

    }
}
