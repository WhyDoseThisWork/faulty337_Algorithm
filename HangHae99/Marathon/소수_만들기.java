package HangHae99.Marathon;

import java.util.Arrays;

public class 소수_만들기 {
    public static void main(String[] args) throws Exception{
        int[] arr = {1, 2, 7, 6, 4};
        System.out.println(solution(arr));
    }
    public static int solution(int[] nums) {
        int answer = 0;
        boolean[] prime = new boolean[3000+1];
        Arrays.fill(prime,true); //소수 배열 초기화
        prime[0] = false;
        prime[1] = false;
        //소수 배열 세팅
        for(int i = 2; i <= 3000; i++){
            if(prime[i]){
                for(int l = i+i; l<= 3000; l+=i){
                    prime[l] = false;
                }
                if(i*i >= 3000)break;
            }
        }
        int size = nums.length;
        for(int i = 0; i < size; i++){
            for(int l = i+1; l< size; l++){
                for(int m = l+1; m < size; m++){
                    if(prime[nums[i] + nums[l] + nums[m]]){
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
}
