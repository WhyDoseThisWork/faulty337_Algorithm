package 단계별로풀어보기.조건문;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _2753 {
    //윤년
    public static void main(String[] arg) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int year = Integer.parseInt(br.readLine());
        if(year%4 == 0){
            if(year%400 == 0){
                System.out.println(1);
            }else if(year%100 == 0){
                System.out.println(0);
            }else{
                System.out.println(1);
            }
        }else{
            System.out.println(0);
        }
    }

}

