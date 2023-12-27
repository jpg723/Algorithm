package 대기업코테유형;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SLIVER5_BJ10431 {
    /*https://www.acmicpc.net/problem/10431
    줄세우기
     */
    public static void main(String agrs[])throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int P = Integer.parseInt(br.readLine());

        for(int i = 0; i < P; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int T = Integer.parseInt(st.nextToken());

            int[] height = new int[20];

            for(int j = 0; j < 20; j++){
                height[j] = Integer.parseInt(st.nextToken());
            }

            int cnt = 0;

            for(int k = 0; k < 20; k++){
                for(int r = 0; r < k; r++){
                    if(height[k] < height[r])
                        cnt++;
                }
            }

            System.out.println(T + " " + cnt);

        }
    }
}
