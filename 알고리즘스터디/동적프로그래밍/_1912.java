package 알고리즘스터디.동적프로그래밍;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1912 {
    //연속합

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        // int[] dp = new int[n];
        int dp = 0;
        int[] arr = new int[n];
        int answer = -10001;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        for(int i = 0;  i < n; i++){
            dp += arr[i];
            if(answer < dp) answer = dp;
            if(dp < 0){
                dp = 0;
                continue;
            }
        }
        System.out.println(answer);
        
    }

}