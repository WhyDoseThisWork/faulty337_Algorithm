package HangHae99.Challenge;

import java.util.Arrays;

public class 소수_찾기 {
    public static void main(String[] args) throws Exception{
        int var1 = 10;
        System.out.println(solution(var1));
    }
    public static int solution(int n) {
        int answer = 0;
        boolean[] prime = new boolean[n+1];
        Arrays.fill(prime,true); //소수 배열 초기화
        prime[0] = false;
        prime[1] = false;
        //소수 배열 세팅
        for(int i = 2; i <= n; i++){
            if(prime[i]){
                for(int l = i+i; l<= n; l+=i){
                    prime[l] = false;
                }
                if(i*i >= n)break;
            }
        }

        for(int i = 0; i <= n; i++){
            if(prime[i]){
                answer++;
            }
        }
        return answer;
    }
}
