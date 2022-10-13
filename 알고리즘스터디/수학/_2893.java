package 알고리즘스터디.수학;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class _2893 {
    // 설탕 배달
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int answer = 0;
        if(N%5 == 0){
            answer = N/5;
        }else if(N == 4 || N == 7){
            answer = -1;
        }else{
            answer += N/5;
            answer += (N%5)/3;
            answer += (N%5)%3;
        }
        System.out.println(answer);
    }

}



