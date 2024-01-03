package 대기업코테유형;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SLIVER5_BJ4659 {
    /*비밀번호 발음하기
    https://www.acmicpc.net/problem/4659
     */
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            
            String pw = br.readLine();
            
            if(pw.equals("end"))
                break;

            //모음(a,e,i,o,u) 하나를 반드시 포함하여야 한다.
            int check1 = 0;
            for(int i = 0; i < pw.length(); i++){
                if(pw.charAt(i) == 'a' || pw.charAt(i) == 'e' || pw.charAt(i) == 'i' || pw.charAt(i) == 'o' || pw.charAt(i) == 'o'){
                    check1++;
                }
            }

            if(check1 == 0) {
                System.out.println("<" + pw + ">" + " is not acceptable.");
                continue;
            }

            //모음이 3개 혹은 자음이 3개 연속으로 오면 안 된다.
            int check2_1 = 0;
            int check2_2 = 0;
            for(int i = 0; i < pw.length(); i++){
                if(pw.charAt(i) == 'a' || pw.charAt(i) == 'e' || pw.charAt(i) == 'i' || pw.charAt(i) == 'o' || pw.charAt(i) == 'u'){
                    check2_1++;
                    check2_2 = 0;

                    if(check2_1 == 3)
                        break;
                }
                else {
                    check2_2++;
                    check2_1 = 0;

                    if(check2_2 == 3)
                        break;
                }
            }

            if(check2_1 == 3 || check2_2 == 3) {
                System.out.println("<" + pw + ">" + " is not acceptable.");
                continue;
            }

            //같은 글자가 연속적으로 두번 오면 안되나, ee 와 oo는 허용한다.
            int check3 = 0;
            for(int i = 0; i < pw.length() - 1; i++){
                if(pw.charAt(i) == pw.charAt(i+1))
                    check3++;
                else
                    check3 = 0;

                if(pw.charAt(i) == 'e' && pw.charAt(i+1) == 'e')
                    check3 = 0;

                if(pw.charAt(i) == 'o' && pw.charAt(i+1) == 'o')
                    check3 = 0;

                if(check3 > 0)
                    break;
            }

            if(check3 > 0) {
                System.out.println("<" + pw + ">" + " is not acceptable.");
                continue;
            }
            System.out.println("<" + pw + ">" + " is acceptable.");
        }
    }
}
