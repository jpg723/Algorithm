package 초급1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class cm_8511 {
    //8511. 가우스와 정다각형

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long k = Long.parseLong(br.readLine());
        int[] prime = {2, 3, 5, 17, 257, 65537};
        boolean check = true;

        for (int i = 0; i < prime.length; i++) {
            while (k % prime[i] == 0) {
                k /= prime[i];
            }
        }

        if (k != 1) {
            check = false;
        }

        // 결과 출력
        if (check) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
