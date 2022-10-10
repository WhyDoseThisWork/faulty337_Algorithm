package 알고리즘스터디.수학;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class _2893 {
    // 설탕 배달
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int five = N/5;
        int three = (N%5)/3;
        while(N%((five*5) + (three*3)) != 0){
            five--;
            if(five == 0){
                three = N/3;
            }else{
                three = (N-(five*5))/3;
            }
            if(five < 0){
                break;
            }
        }
        if(five < 0){
            System.out.println(-1);
        }else{
            System.out.println(five + three);
        }
    }

}



