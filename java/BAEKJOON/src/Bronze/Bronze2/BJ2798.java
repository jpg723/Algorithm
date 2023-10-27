package Bronze.Bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ2798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int N = Integer.parseInt(st.nextToken()); //카드개수
        int M = Integer.parseInt(st.nextToken()); //카드개수
        int[] card = new int[N];

        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < N; i++){

            card[i] = Integer.parseInt(st.nextToken());
        }

        int result = 0;

        for(int i = 0; i < N - 2; i++){
            for(int j = i + 1; j < N - 1; j++){
                for(int k = j + 1; k < N; k++){
                    int sum = card[i] + card[j] + card[k];

                    if(sum == M) {
                        result = sum;
                        break;
                    }

                    else if(sum > M)
                        continue;

                    else {
                        if(result < sum)
                            result = sum;
                    }
                }
            }
        }

        System.out.println(result);
    }
}
