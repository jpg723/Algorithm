package 백트래킹;

import java.io.*;
import java.nio.Buffer;
import java.util.Arrays;
import java.util.StringTokenizer;

public class SLIVER3_BJ15655 {
    /*https://www.acmicpc.net/problem/15655
    N과 M(6)
     */

    static int[] arr;
    static boolean[] visit;
    static int[] result;
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        visit = new boolean[N];
        result = new int[M];
        arr = new int[N];

        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < N; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(arr);
        dfs(N, M , 0, 0);
    }

    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void dfs(int n, int m, int depth, int start) throws IOException{

        if(m == depth){
            for(int var: result)
                bw.write(var + " ");
            bw.write("\n");
            bw.flush();
        }

        else{
            for(int i = start; i < n; i++){
                if(visit[i] == false){
                    visit[i] = true;
                    result[depth] = arr[i];
                    dfs(n, m, depth + 1, i + 1);
                    visit[i] = false;
                }
            }
        }
    }
}
