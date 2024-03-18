package 초급;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.StringTokenizer;

public class cm_8515 {
    //8515. 분수를 소수로

    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        long inputP = Long.parseLong(st.nextToken());
        long inputQ = Long.parseLong(st.nextToken());
        int n = Integer.parseInt(br.readLine());

        BigDecimal p = new BigDecimal(inputP);
        BigDecimal q = new BigDecimal(inputQ);

        BigDecimal result = p.divide(q, n, RoundingMode.HALF_EVEN);

        System.out.println(result);
    }
}
