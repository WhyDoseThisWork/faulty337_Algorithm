package HangHae99.Challenge;

import java.util.Arrays;

public class 체육복 {
    public static void main(String[] args) throws Exception{
        int[] arr = {4, 2};
        int[] arr1 = {3, 5};
        
        System.out.println(solution(5, arr, arr1));
    }
    public static int solution(int n, int[] lost, int[] reserve) {
        int answer = n;
        boolean[] extra = new boolean[n+2];
        for(int i : reserve)extra[i] = true;
        Arrays.sort(lost);
        for(int i = 0; i < lost.length; i++){
            if(extra[lost[i]]){
                extra[lost[i]] = false;
                lost[i] = 0;
            }
        }
        for(int i : lost){
            if(i != 0){
                if(extra[i-1]){
                    extra[i-1] = false;
                }else if(extra[i+1]){
                    extra[i+1] = false;
                }else if(extra[i]){
                    extra[i] = false;
                }else{
                    answer--;
                }
            }
            
        }
        return answer;
    }

}
