package D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D2_2001_파리퇴치 {
    /*https://swexpertacademy.com/main/code/problem/problemDetail.do?problemLevel=2&contestProbId=AV5PzOCKAigDFAUq&categoryId=AV5PzOCKAigDFAUq&categoryType=CODE&problemTitle=&orderBy=RECOMMEND_COUNT&selectCodeLang=JAVA&select-1=2&pageSize=10&pageIndex=1
    파리퇴치
     */
    public static void main(String args[])throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for(int t = 0; t < T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            int[][] arr = new int[N][N];
            int[] sum = new int[10000];

            //배열 입력
            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine(), " ");
                for (int j = 0; j < N; j++) {
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            int index = 0;
            for (int i = 0; i < N - M + 1; i++) {
                for (int j = 0; j < N - M + 1; j++) {

                    for (int k = j; k < M; k++) {
                        sum[index] += arr[i + k][j];
                        System.out.print(arr[i + k][j] + " ");
                    }
                    sum[index] -= arr[i][j];
                    System.out.println(sum[index]);
                    System.out.println();
                    index++;
                }
            }

            int[] result = new int[N * N];
            int size = 0;
            int start = 0;
            for (int i = 0; i < index - 1; i++) {

                for (int j = start; j < M; j++) {
                    result[size] += sum[i + j];
                }
                //System.out.println(result[size]);
                size++;
            }

            int max = 0;
            for (int i = 0; i < size; i++) {
                if (max < result[i])
                    max = result[i];
            }

            //System.out.println("#" + (t + 1) + " " + max);
        }
    }
}
