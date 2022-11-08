package 백준;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _1978 {
    //소수 찾기
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        boolean[] prime = new boolean[1001];
        int answer = 0;
        Arrays.fill(prime,true); //소수 배열 초기화
        prime[0] = false;
        prime[1] = false;
        //소수 배열 세팅
        for(int i = 2; i <= 1000; i++){
            if(prime[i]){
                for(int l = i+i; l<= 1000; l+=i){
                    prime[l] = false;
                }
                if(i*i > 1000)break;
            }
        }
        for(int i = 0; i<N; i++){
            if(prime[Integer.parseInt(st.nextToken())]){
                answer++;
            }
        }
        System.out.println(answer);

    }
}