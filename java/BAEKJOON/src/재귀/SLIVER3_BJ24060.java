package 재귀;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SLIVER3_BJ24060 {
    /*https://www.acmicpc.net/problem/24060
    알고리즘 수업-병합정렬1
     */
    public static void main(String args[])throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        //N과 K입력
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        //배열 A입력
        int[] A = new int[N];

        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < N; i++)
            A[i] = Integer.parseInt(st.nextToken());

        merge_sort(A, 0, N);

        for(int i = 0; i < N; i++)
            System.out.println(A[i]);
    }

    public static void merge_sort(int A[], int p, int r) { // A[p..r]을 오름차순 정렬한다.
        if (p < r) {
            int q = (p + r) / 2;       // q는 p, r의 중간 지점
            merge_sort(A, p, q);      // 전반부 정렬
            merge_sort(A, q + 1, r);  // 후반부 정렬
            merge(A, p, q, r);        // 병합
        }
    }

    //A[p..q]와 A[q+1..r]을 병합하여 A[p..r]을 오름차순 정렬된 상태로 만든다.
    //A[p..q]와 A[q+1..r]은 이미 오름차순으로 정렬되어 있다.
    public static void merge(int A[], int p, int q, int r) {
        int i = p;
        int j = q + 1;
        int t = 1;
        int[] tmp = new int[i + j];

        while (i <= q && j <= r) {
            if (A[i] <= A[j])
                tmp[t++] = A[i++]; //tmp[t] <- A[i]; t++; i++;
            else
                tmp[t++] = A[j++]; //tmp[t] <- A[j]; t++; j++;
        }
        while (i <= q)  // 왼쪽 배열 부분이 남은 경우
            tmp[t++] = A[i++];

        while (j <= r)  // 오른쪽 배열 부분이 남은 경우
            tmp[t++] = A[j++];
        i = p;
        t = 1;
        while (i <= r)  // 결과를 A[p..r]에 저장
            A[i++] = tmp[t++];
    }
}
