package 백트래킹;

import java.io.*;
import java.util.StringTokenizer;

public class SLIVER3_BJ15651 {
    /*
    https://www.acmicpc.net/problem/15651
    N과M(3)
     */

    public static int[] arr;
    public static boolean[] visit;
    public static void main(String args[])throws IOException{
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

        if(m == depth) {
            for (int var : arr)
                bw.write(var + " ");
            bw.write("\n");
            return;
        }

        else{
            for(int i = 0; i < n; i++){
                if(visit[i] == false) {
                    arr[depth] = i + 1;
                    dfs(n, m, depth + 1);
                    visit[i] = false;
                }
            }
        }
    }
}
