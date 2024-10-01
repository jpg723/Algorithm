package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bronze3_BJ23971 {
    // https://www.acmicpc.net/problem/23971
    // ZOAC 4

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int H = Integer.parseInt(st.nextToken());
        int W = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int cnt = 0;
        int i = 0;

        while(i < H){

            int j = 0;
            while(j < W){
                //System.out.println(i + ", " + j);
                j++;
                j += M;
                cnt++;
            }
            i++;
            i += N;
        }

        System.out.println(cnt);
    }
}
