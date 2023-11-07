package 백트래킹;

import java.io.*;
import java.util.StringTokenizer;

public class SLIVER3_BJ15652 {
    /*https://www.acmicpc.net/problem/15652
    N과M(4)
     */

    public static int[] arr;
    public static boolean[] visit;
    public static int n1 = 1;
    public static int n2 = 1;

    public static void main(String args[]) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

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
                if(temp > var) {
                    check = true;
                }
                temp = var;
            }

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
