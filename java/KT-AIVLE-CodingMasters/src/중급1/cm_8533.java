package 중급1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class cm_8533 {
    //8533. 카페 사장 철수
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        //N, M입력
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] enter = new int[M];
        int[] exit= new int[M];
        
        //시간 입력
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            String[] enterTime = st.nextToken().split(":");
            String[] exitTime = st.nextToken().split(":");

            //초로 변환
            enter[i] = Integer.parseInt(enterTime[0]) * 3600 + Integer.parseInt(enterTime[1]) * 60 + Integer.parseInt(enterTime[2]);
            exit[i] = Integer.parseInt(exitTime[0]) * 3600 + Integer.parseInt(exitTime[1]) * 60 + Integer.parseInt(exitTime[2]);
        }

        int temp1 = 0;
        int temp2 = 0;

        //들어온 시간 순 오름차순 정렬
        for(int i = 0; i < M; i++){
            for(int j = i + 1; j < M; j++){
                if(enter[i] > enter[j]){
                    temp1 = enter[j];
                    enter[j] = enter[i];
                    enter[i] = temp1;

                    temp2 = exit[j];
                    exit[j] = exit[i];
                    exit[i] = temp2;
                }
            }
        }

        int count = 0;
        //머물러 있는 손님 시간을 저장하는 변수
        ArrayList<Integer> stay = new ArrayList<>();
        for(int i = 0; i < M; i++){

            //수용 가능 인원보다 방문한 인원이 적은 경우
            if(count < N) {
                count++;
                //머물러 있는 경우 stay에 손님이 나갈 시간 저장
                stay.add(exit[i]);
            }

            else{
                //머물러 있는 손님들 중에서
                for(int j = 0; j < stay.size(); j++) {
                    //나갈 시간이 들어온 시간보다 빠른 경우
                    if (enter[i] >= stay.get(j)) {
                        count++;
                        //나간 손님의 시간은 삭제
                        stay.remove(j);
                        //새로 들어온 손님의 시간 추가
                        stay.add(exit[i]);
                        break;
                    }
                }
            }
        }

        System.out.println(count);
    }
}
