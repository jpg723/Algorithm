package 기초;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class cm_8481 {
    //8481. 우리반 아이큐왕은
    public static void main(String[]args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        String[] name = new String[N];
        int[] iq = new int[N];
        int[] sort_iq = new int[N];
        String[] check_name = new String[3];

        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            name[i] = st.nextToken();
            iq[i] = Integer.parseInt(st.nextToken());
            sort_iq[i] = iq[i];
        }

        Arrays.sort(sort_iq);
        int index = 0;

        for(int i = N - 1; i >= N - 3; i--){
            for(int j = 0; j < N; j++){
                

                if(sort_iq[i] == iq[j]) {
                    System.out.println(name[j]);
                    check_name[index] = name[j];
                    break;
                }
            }
        }

        /*
        7
jang 180
nana 125
min 125
hani 125
hyun 97
jack 86
         */
    }
}
