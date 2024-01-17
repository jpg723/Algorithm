package Backtracking;

import java.io.*;
import java.util.StringTokenizer;

public class SLIVER3_BJ15652 {
    /*https://www.acmicpc.net/problem/15652
    N과M(4)
     */

    public static int[] arr;
    public static boolean[] visit;

    public static void main(String args[]) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        //N과 M입력
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        arr = new int[M];
        visit = new boolean[N];

        dfs(N, M, 0);
        bw.flush();
    }

    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void dfs(int n, int m, int depth) throws IOException {

        int temp = 0;

        if(m == depth){
            boolean check = false;

            for(int var: arr) {
                //arr요소가 temp보다 작으면 check를 true로 변경한다.
                //(이미 출력했다는 표시)
                if(temp > var) {
                    check = true;
                    break;
                }
                //크면 temp를 현재 arr요소의 다음 요소로 변경한다.
                temp = var;
            }

            //check가 false면 출력
            if(check  == false) {
                for (int var : arr) {
                    bw.write(var + " ");
                }
                bw.write("\n");
            }
        }

        else{
            for(int i = 0; i < n; i++){
                if(visit[i] == false){
                    arr[depth] = i + 1;
                    dfs(n, m, depth + 1);
                }
            }
        }
    }
}
