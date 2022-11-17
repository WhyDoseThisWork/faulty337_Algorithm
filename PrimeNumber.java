import java.util.Arrays;

public class PrimeNumber {
    public void getprimeNum(int N){
        boolean[] prime = new boolean[N+1];
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
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<=N; i++){
            if(prime[i]){
                sb.append(i + "\n");
            }
        }
    }
}
