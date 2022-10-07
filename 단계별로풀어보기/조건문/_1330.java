package 단계별로풀어보기.조건문;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _1330 {
    //두 수 비교하기
    public static void main(String[] arg) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nums = br.readLine().split(" ");
        int A = Integer.parseInt(nums[0]);
        int B = Integer.parseInt(nums[1]);
        if(A > B){
            System.out.println(">");
        }else if(A < B){
            System.out.println("<");
        }else{
            System.out.println("==");
        }
        // System.out.println(A > B ? ">": A < B ? "<" : "==" );
    }

}

