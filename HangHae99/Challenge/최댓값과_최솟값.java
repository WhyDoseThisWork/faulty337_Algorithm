package HangHae99.Challenge;

import java.util.Arrays;

public class 최댓값과_최솟값 {
    public static void main(String[] args) throws Exception{
        String str = "2 3 4 1";
        Solution s = new Solution();
        System.out.println(s.solution(str));
    }
    
    static class Solution {
        public String solution(String s) {
            int[] arr = Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).toArray();
            Arrays.sort(arr);
            String answer = arr[0] + " " +arr[arr.length-1];
            return answer;
        }
    }
}
