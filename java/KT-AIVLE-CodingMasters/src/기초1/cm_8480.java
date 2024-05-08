package 기초1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class cm_8480 {
    //8480. 아까운 쿠폰
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] coupon = {50000, 10000, 5000, 1000, 500, 100, 50, 10};

        int count = 0;

        for(int i = 0; i < coupon.length; i++){

            count += N / coupon[i];
            N = N % coupon[i];
        }

        System.out.println(count);
    }
}
