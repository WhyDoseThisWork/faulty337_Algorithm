package 알고리즘스터디.수학;

import java.io.BufferedReader;
import java.io.InputStreamReader;



public class _2292 {
    //벌집
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int roomNum = Integer.parseInt(br.readLine());
        int temp = (int)Math.ceil((double)(roomNum-1)/ 6); //double변환하지 않을 시 그냥 int연산이되어 올림이 제대로 안됨
        int answer = (int)Math.sqrt(temp*2);
        if(temp*2 - (int)Math.pow(answer, 2) > answer){
            answer++;
        }
        System.out.println(answer+1);
    }

}