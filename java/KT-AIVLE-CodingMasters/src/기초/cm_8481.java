package 기초;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class cm_8481 {
    //8481. 우리반 아이큐왕은

    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //N입력
        int N = Integer.parseInt(br.readLine());

        String[] name = new String[N];
        int[] iq = new int[N];
        
        //이름, 아이큐 입력
        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            name[i] = st.nextToken();
            iq[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < N; i++){
            for(int j = i + 1; j < N; j++){
                if(iq[i] < iq[j]){
                    int temp_iq = iq[j];
                    String temp_name = name[j];

                    iq[j] = iq[i];
                    name[j] = name[i];

                    iq[i] = temp_iq;
                    name[i] = temp_name;
                }
            }
        }

        for(int i = 0; i < 3; i++){
            System.out.println(name[i]);
        }
    }
}
