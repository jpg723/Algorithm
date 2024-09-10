package Graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SLIVER3_BJ2606 {
    
    //https://www.acmicpc.net/problem/2606
    // 바이러스

    static boolean[][] arr;
    static  boolean[] check;
    static int count = 0;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());  // 컴퓨터 수
        int m = Integer.parseInt(br.readLine());  // 네트워크 상 연결된 컴퓨터 쌍의 수

        arr = new boolean[n+1][n+1];
        check = new boolean[n+1];

        for (int i = 0; i < m; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            arr[a][b] = arr[b][a] = true;  // 양방향 연결 설정
        }

        dfs(n, 1);
        System.out.println(count-1); // 시작하는 컴퓨터(1)을 빼줌
    }

    public static void dfs(int n, int v){

        check[v] = true;
        count++;

        for(int i = 0; i <= n; i++){
            if(arr[v][i] == true && !check[i]){
                dfs(n, i);
            }
        }
    }
}
