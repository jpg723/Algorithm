package 초급2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class cm_8678 {
    //8678. 소수 판별(에라토스테네스의 체 알고리즘)
    
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int check = 1; // 소수 판별
        
        // A입력
        long A = Long.parseLong(br.readLine());
        
        // 결과출력
        System.out.println(isPrime(A));
    }

    // 소수 판별 메서드(에라토스테네스의 체 알고리즘)
    public static int isPrime(long num) {

        if (num == 1) // 1인 경우 소수가 아님
            return 0;

        if (num == 2 || num == 3) // 2, 3인 경우 소수
            return 1;

        if (num % 2 == 0 || num % 3 == 0) // 2, 3으로 나누어 떨어지는 경우 소수가 아님
            return 0;

        // 소수를 판별할 때, 제곱근까지만 확인해도 충분!
        long sqrtNum = (long) Math.sqrt(num); // num의 제곱근
        for (long i = 5; i <= sqrtNum; i += 6) { // 5부터 시작해 +6을 기준으로 소수 판별
            if (num % i == 0) { // 자기자신 이외의 다른 수로 나눠 떨어지면 소수가 아님
                return 0;
            }
        }
        return 1;
    }
}
