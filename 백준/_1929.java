package 백준;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _1929 {
    //소수 구하기

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
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
        for(int i = M; i<=N; i++){
            if(prime[i]){
                sb.append(i + "\n");
            }
        }
        sb.deleteCharAt(sb.length()-1);
        System.out.println(sb.toString());

    }

}