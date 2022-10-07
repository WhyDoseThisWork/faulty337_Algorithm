package 백준.누적합;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _2559 {
    public static void main(String[] arg)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] temp = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        // for(int i = 0; i < N; i++){
        //     System.out.print(temp[i] + " ");
        // }
        int[] tempSum = new int[N-K+1];
        for(int i = 0; i < K; i++){
            tempSum[0] += temp[i];
        }
        for(int i = 1; i< N-K+1; i++){
            tempSum[i] = tempSum[i-1] -temp[i-1] + temp[i + K-1];
        }
        System.out.println(Arrays.stream(tempSum).max().getAsInt());
    }
        
}