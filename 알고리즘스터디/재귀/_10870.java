package 알고리즘스터디.재귀;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _10870 {
    //피보나치
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(getFibonacci(n-1));
    }

    public static int getFibonacci(int result){
        if(result == 0){
            return 1;
        }else if(result < 0){
            return 0;
        }
        return getFibonacci(result-1) + getFibonacci(result-2);
    }
    

}