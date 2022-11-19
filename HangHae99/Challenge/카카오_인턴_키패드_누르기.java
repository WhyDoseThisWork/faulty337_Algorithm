package HangHae99.Challenge;

public class 카카오_인턴_키패드_누르기 {
    public static void main(String[] args) throws Exception{
        int[] arr = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        Solution s = new Solution();
        // for(String str :s.solution(arr, "right"))System.out.println(str);
        System.out.println(s.solution(arr, "right"));
    }
    
    static class Solution {
        
        public String solution(int[] numbers, String hand) {
            String answer = "";
            char[] finger = {' ', 'L', 'C', 'R', 'L', 'C', 'R', 'L', 'C', 'R', 'L', 'C', 'R'} ;
            int left = 10;
            int right = 12;
            int lDis = 0;
            int rDis = 0;
            int temp;
            for(int i : numbers){
                if(i == 0){
                    i = 11;
                }
                if(i%3 == 0){
                    right = i;
                    answer += finger[i];
                }else if(i%3 == 1){
                    left = i;
                    answer += finger[i];
                }else{
                    temp = Math.abs(i-left);
                    lDis = temp/3 + temp%3;
                    temp = Math.abs(i-right);
                    rDis = temp/3 + temp%3;
                    if(lDis > rDis){
                        right = i;
                        answer += 'R';
                    }else if(lDis < rDis){
                        left = i;
                        answer += 'L';
                    }else{
                        if(hand.equals("right")){
                            right = i;
                            answer += 'R';
                        }else{
                            left = i;
                            answer += 'L';
                        }
                    }
                }
            }
            return answer;
        }
    }
}
