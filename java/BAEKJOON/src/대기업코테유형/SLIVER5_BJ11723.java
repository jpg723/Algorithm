package 대기업코테유형;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class SLIVER5_BJ11723 {
    /*https://www.acmicpc.net/problem/11723
    집합
     */
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //M입력
        int M = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        Set<Integer> set = new HashSet<>(); // 중복 허용 X

        for (int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            String str = st.nextToken();
            int x = 0;

            switch (str) {
                case "add" :
                    x = Integer.parseInt(st.nextToken());
                    set.add(x);
                    break;

                case "remove" :
                    x = Integer.parseInt(st.nextToken());
                    set.remove(x);
                    break;
                case "check" :
                    x = Integer.parseInt(st.nextToken());
                    if (set.contains(x))
                        sb.append("1\n");
                    else
                        sb.append("0\n");
                    break;
                case "toggle" :
                    x = Integer.parseInt(st.nextToken());
                    if (set.contains(x))
                        set.remove(x);
                    else
                        set.add(x);
                    break;
                case "all" :
                    for (int k = 0; k < 20; k++) {
                        set.add(k + 1);
                    }
                    break;
                case "empty" :
                    set.clear();
                    break;
            }
        }
        System.out.println(sb.toString());
    }
}
