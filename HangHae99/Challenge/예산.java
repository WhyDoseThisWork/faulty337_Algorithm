package HangHae99.Challenge;

import java.util.Arrays;

public class 예산 {
    
    public static void main(String[] args) throws Exception{
        int[] arr = {1,3,2,5,4};
        System.out.println(solution(arr, 9));
    }
    public static int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        for(int i : d){
            budget -= i;
            if(budget < 0)break;
            answer++;
        }
        return answer;
    }
}
