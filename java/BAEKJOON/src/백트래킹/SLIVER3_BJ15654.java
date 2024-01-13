package 백트래킹;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class SLIVER3_BJ15654 {
    /*https://www.acmicpc.net/problem/15654
    N과 M(5)
     */

    public static int[] arr;
    public static int[] result;
    public static boolean[] visit;
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        arr = new int[N];
        result = new int[M];

        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < N; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(arr);
        visit = new boolean[N];

        dfs(N, M, 0);
    }

    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void dfs(int n, int m, int depth) throws IOException{

        if(m == depth){
            for(int var: result)
                bw.write(var + " ");
            bw.write("\n");
            bw.flush();
        }

        else{
            for(int i = 0; i < n; i++) {
                if (visit[i] == false){
                    visit[i] = true;
                    result[depth] = arr[i];
                    dfs(n, m, depth + 1);
                    visit[i] = false;
                }
            }
        }
    }
}
