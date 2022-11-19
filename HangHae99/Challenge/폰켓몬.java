package HangHae99.Challenge;

import java.util.HashSet;
import java.util.Set;

public class 폰켓몬 {
    public static void main(String[] args) throws Exception{
        int[] arr = {3,3,3,2,2,4};
        Solution s = new Solution();
        System.out.println(s.solution(arr));
    }
    static class Solution {
        public int solution(int[] nums) {
            int answer = 0;
            Set<Integer> set = new HashSet<>();
            for(int i : nums){
                set.add(i);
            }
            int size = set.size();
            int getTotal = nums.length/2;
            if(size > (getTotal)){
                answer = getTotal;
            }else{
                answer = size;
            }
            return answer;
        }
    }
}
