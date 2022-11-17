package 백준;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _4948 {
    //베르트랑 공준
    static final int MAX = 246913;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[] prime = new boolean[MAX];
        Arrays.fill(prime,true); //소수 배열 초기화
        prime[0] = false;
        prime[1] = false;
        //소수 배열 세팅
        for(int i = 2; i <= MAX; i++){
            if(prime[i]){
                for(int l = i+i; l<= MAX; l+=i){
                    prime[l] = false;
                }
                if(i*i >= MAX)break;
            }
        }
        StringBuilder sb = new StringBuilder();
        int N, count;
        N = Integer.parseInt(br.readLine());
        while(N != 0){
            
            count = 0;
            for(int i = N+1; i<=(N*2); i++){
                if(prime[i]){
                    count++;
                }
            }
            sb.append(count + "\n");
            N = Integer.parseInt(br.readLine());
        }
        
        sb.deleteCharAt(sb.length()-1);
        System.out.println(sb.toString());

    }

}
