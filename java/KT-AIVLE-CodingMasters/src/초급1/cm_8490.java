package 초급1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class cm_8490 {
    //8490. 내 이름이 적힌 번호 찾기

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        String name = st.nextToken();

        String[] nameList = new String[N];
        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < N; i++){
            nameList[i] = st.nextToken();
        }

        for(int i = 0; i < N; i++){
            if(nameList[i].equals(name)) {
                System.out.println(i + 1);
                break;
            }
        }
    }
}
