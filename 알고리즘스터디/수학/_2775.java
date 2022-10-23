package 알고리즘스터디.수학;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _2775 {
    //부녀회장이 될테야
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());
        int k, n;
        int[][] floor = peoplesNumber();
        for(int i = 0; i < T; i++){
            k = Integer.parseInt(br.readLine());
            n = Integer.parseInt(br.readLine());
            System.out.println(floor[k+1][n-1]);
        }
        
    }

    public static int[][] peoplesNumber(){
        int[][] floor = new int[16][14];
        for(int[] t :floor){
            Arrays.fill(t, 1);
        }
        for(int i = 1; i < 16; i++){
            for(int l = 1; l < 14; l++){
                floor[i][l] = floor[i-1][l] + floor[i][l-1];
            }
        }
        return floor;
    }
}