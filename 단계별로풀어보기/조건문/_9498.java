package 단계별로풀어보기.조건문;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _9498 {
    //시험 성적
    public static void main(String[] arg) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int score = Integer.parseInt(br.readLine());
        System.out.println(score >= 90 ? "A" : score >=80 ? "B" : score >= 70 ? "C" : score >= 60 ? "D" : "F");
    }

}

