package HangHae99.Challenge;

public class 숫자의_표현 {
    public static void main(String[] args) throws Exception{
        String str = "2 3 4 1";
        Solution s = new Solution();
        for(int i = 0; i < 100; i++){
            System.out.println(i + " : " + s.solution(i));
        }
        
    }
    
    static class Solution {
        public int solution(int n) {
            int answer = 0;
            int[] val = new int[n+1];
            int total = 0;
            for(int i = 0; i <= n; i++){
                total += i;
                val[i] = total;
            }
            for(int i = n; i >= 0; i--){
                for(int l = i-1; l >= 0; l--){
                    if(val[i] - val[l] == n){
                        answer++;
                        break;
                    }
                    if(val[i] - val[l] > n){
                        break;
                    }
                }
            }
            return answer;
        }
    }
}
