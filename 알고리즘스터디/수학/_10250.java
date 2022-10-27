package 알고리즘스터디.수학;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _10250 {
    // ACM 호텔
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int H, W, N;
        String answer;
        StringTokenizer st;
        for(int i = 0; i < T; i++){
            st = new StringTokenizer(br.readLine());
            H = Integer.parseInt(st.nextToken());
            W = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            answer = (N-1)%(H)+1 + String.format("%02d", (N-1)/H + 1);
            System.out.println(answer);
        }
        
    }
}