package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class GOLD5_BJ1700 {
    //https://www.acmicpc.net/problem/1700
    // 멀티탭 스케줄링
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] order = new int[K]; // 사용 순서

        // 사용 순서 입력
        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < K; i++){
            order[i] = Integer.parseInt(st.nextToken());
        }

        boolean[] use = new boolean[101]; // 전기용품 사용 유무
        int put = 0; // 사용 중인 콘센트 개수
        int ans = 0;
        for (int i = 0; i < K; i++) {
            int temp = order[i];

            if (!use[temp]) { // 콘센트가 꽂혀있지 않은 경우
                if (put < N) { // 콘센트를 꽂을 공간이 있는 경우
                    use[temp] = true; // 사용 중으로 변경
                    put++; // 사용 중인 콘센트 개수 증가
                }

                else { // 콘센트를 꽂을 공간이 없는 경우
                    ArrayList<Integer> arrList = new ArrayList<>();
                    for (int j = i; j < K; j++) { // 현재 꽂혀있는 콘센트들이 나중에도 사용되는지 확인
                        if (use[order[j]] && !arrList.contains(order[j])) { // 나중에도 사용되면서 arrList에 추가되어 있지 않은(중복 추가 방지) 전기용품이라면
                            arrList.add(order[j]); // arrList에 추가
                        }
                    }

                    if (arrList.size() != N) { // 현재 꽂혀있는 콘센트들 중 일부만 나중에 사용된다면,
                        for (int j = 0; j < use.length; j++) {
                            if (use[j] && !arrList.contains(j)) { // 나중에도 사용되지 않는 콘센트를 제거하고,
                                use[j] = false; // 현재 사용하려는 콘센트를 꽂는다.
                                break;
                            }
                        }
                    }
                    else { // 현재 꽂혀 있는 모든 콘센트가 나중에도 사용될 경우
                        int remove = arrList.get(arrList.size() - 1); // 가장 마지막에 사용될 콘센트를 제거.
                        use[remove] = false;
                    }

                    use[temp] = true;
                    ans++;
                }
            }
        }

        System.out.println(ans);

    }
}
