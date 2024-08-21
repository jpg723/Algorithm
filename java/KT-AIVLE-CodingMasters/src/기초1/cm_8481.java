package 기초1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class cm_8481 {
    //8481. 우리반 아이큐왕은

    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 학생 수 입력
        int n = Integer.parseInt(br.readLine());

        // 이름과 IQ를 저장할 Map 생성
        Map<String, Integer> iqMap = new HashMap<>();

        // 이름과 IQ 입력
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int iq = Integer.parseInt(st.nextToken());

            if(name.length() < 10 && iq >= 50 && iq <= 200)
                iqMap.put(name, iq);
        }

        // IQ가 높은 순서대로 정렬
        List<Map.Entry<String, Integer>> list = new ArrayList<>(iqMap.entrySet());
        list.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        // 상위 3명의 이름 출력
        for (int i = 0; i < Math.min(3, list.size()); i++) {
            System.out.println(list.get(i).getKey());
        }
    }
}
