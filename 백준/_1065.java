package 백준;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _1065 {
    //한수

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int answer = 0;
        if(N < 99){
            answer = N;
        }else{
            answer = 99;
            for(int i = 100; i <= N; i++){
                if(han(i)) answer++;
            }
        }
        System.out.println(answer);
    }

    public static boolean han(int num){
        int t = (num%100)/10;
        int h = num/100;
        int o = num%10;
        if(h-t == t-o){
            return true;
        }else{
            return false;
        }
    }
}