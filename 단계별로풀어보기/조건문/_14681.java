package 단계별로풀어보기.조건문;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _14681 {
    //사분면 고르기
    public static void main(String[] arg) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());
        int answer;
        if(x > 0){
            if(y > 0){
                answer = 1;
            }else{
                answer = 4;
            }
        }else{
            if(y > 0){
                answer = 2;
            }else{
                answer = 3;
            }
        }
        System.out.print(answer);
    }

}


