package 중급2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class cm_8702 {
    // 8702. 이웃

    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        // 정점 개수(N), 간선 개수(M), 가중치 차이(K) 입력
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] s = new int[N];

        // 정점의 가중치(s) 입력
        for(int i = 0; i < N; i++)
            s[i] = Integer.parseInt(br.readLine());

        // 간선의 정보(u, v) 입력
        int[] u = new int[M];
        int[] v = new int[M];
        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine(), " ");
            u[i] = Integer.parseInt(st.nextToken());
            v[i] = Integer.parseInt(st.nextToken());
        }

        // 가중치가 최대인 정점 찾기
        int max = 0;
        int maxNode = 0;
        for(int i = 0; i < N; i++){
            if(max < s[i]) {
                max = s[i];
                maxNode = i + 1;
            }
        }

        for(int i = M - 2; i >= 0; i--){
            if(u[i] == maxNode || v[i] == maxNode){
                int temp1 = u[i];
                int temp2 = v[i];
                u[i] = u[i+1];
                v[i] = v[i+1];
                u[i+1] = temp1;
                v[i+1] = temp2;
            }
        }

        for(int i = 0; i < M; i++){
            System.out.println(u[i] + " " + v[i]);
        }

        int cost = 0;
        for(int i = (M - 1); i >= 0; i--){

            if(u[i] > v[i]) {
                int temp = u[i];
                u[i] = v[i];
                v[i] = temp;
            }

            //System.out.println(Math.abs(Math.abs(s[v[i] - 1] - s[u[i] - 1])));
            if (Math.abs(s[v[i] - 1] - s[u[i] - 1]) > K) {
                System.out.println(Math.abs(s[v[i] - 1] - s[u[i] - 1]) - K);
                cost += Math.abs(s[v[i] - 1] - s[u[i] - 1]) - K;
                s[u[i] - 1] = (s[v[i] - 1] - K);
            }
        }

        System.out.println(cost);
    }
}
