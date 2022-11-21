package 백준;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _9020 {
    //골드바흐의 추측
    static final int MAX = 10001;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        boolean[] prime = new boolean[MAX];
        Arrays.fill(prime,true); //소수 배열 초기화
        prime[0] = false;
        prime[1] = false;
        //소수 배열 세팅
        for(int i = 2; i < MAX; i++){
            if(prime[i]){
                for(int l = i+i; l< MAX; l+=i){
                    prime[l] = false;
                }
                if(i*i >= MAX)break;
            }
        }
        int n, temp;
        for(int i = 0; i < T; i++){
            n = Integer.parseInt(br.readLine());
            temp = n/2;
            if(prime[temp]){
                sb.append(temp +" "+ temp +"\n");
            }else{
                for(int l = temp; l > 1; l--){
                    if(prime[l] && prime[n-l]){
                        sb.append(l +" "+ (n-l) +"\n");
                        break;
                    }
                }
            }
        }
        sb.deleteCharAt(sb.length()-1);
        System.out.println(sb.toString());

    }

}
