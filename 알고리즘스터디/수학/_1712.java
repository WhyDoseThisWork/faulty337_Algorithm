package 알고리즘스터디.수학;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1712 {
    //손익분기점

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int answer = 0;
        int income = C-B;
        if(income > 0){
            answer = (int)(A/income)+1;
        }else{
            answer = -1;
        }
        System.out.println(answer);

    }
}



