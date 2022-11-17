package 백준;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _2581 {
    //소수

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        boolean[] prime = new boolean[N+1];
        int sum = 0;
        int min = 0;
        Arrays.fill(prime,true); //소수 배열 초기화
        prime[0] = false;
        prime[1] = false;
        //소수 배열 세팅
        for(int i = 2; i <= N; i++){
            if(prime[i]){
                for(int l = i+i; l<= N; l+=i){
                    prime[l] = false;
                }
                if(i*i >= N)break;
            }
        }
        for(int i = M; i<=N; i++){
            if(prime[i]){
                if(min == 0){
                    min = i;
                }
                sum+= i;
            }
        }

        if(min == 0){
            System.out.println(-1);
        }else{
            System.out.println(sum);
            System.out.println(min);
        }

    }

}