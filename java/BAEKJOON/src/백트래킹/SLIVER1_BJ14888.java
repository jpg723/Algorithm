package 백트래킹;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class SLIVER1_BJ14888 {
    /*https://www.acmicpc.net/problem/14888
    연산자 끼워넣기
     */

    public static int[] arr;
    public static int[] op = new int[4];
    static List<String> op2 = new ArrayList<>();
    public static boolean[] visit;
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //숫자 개수 입력
        int N = Integer.parseInt(br.readLine());

        arr = new int[N];

        //숫자 입력
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        //연산자 개수 입력
        st = new StringTokenizer(br.readLine(), " ");
        for(int i= 0; i < 4; i++){
            op[i] = Integer.parseInt(st.nextToken());
        }

        dfs(arr[0], 0);
    }

    public static void dfs(int n, int depth){

        if(n == depth){
            for(String var:op2)
                System.out.print(op2 + " ");
            System.out.println();
            return;
        }

        else{
            for(int i = 0; i < 4; i++){
                for(int j = 0; j < op[i]; j++){
                    if(i == 0)
                        op2.add("+");

                    else if(i == 1)
                        op2.add("-");

                    else if(i == 2)
                        op2.add("*");

                    else
                        op2.add("/");
                }
            }
        }
    }
}
