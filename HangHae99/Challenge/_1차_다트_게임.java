package HangHae99.Challenge;

public class _1차_다트_게임 {
    public static void main(String[] args) throws Exception{
        String str = "1S*2T*3S";
        Solution s = new Solution();
        System.out.println(s.solution(str));
    }
    
    static class Solution {
        public int solution(String dartResult) {
            int[] score = new int[3];
            char c;
            int index = 0;
            for(int i = 0; i < dartResult.length(); i++){
                c = dartResult.charAt(i);
                if(c >= 48 && c <=57){
                    if(dartResult.charAt(i+1) == '0'){
                        score[index] = 10;
                        i++;
                    }else{
                        score[index] = c-48;
                    }
                    index++;
                    
                }else{
                    switch(c){
                        case 'S':
                            break;
                        case 'D':
                            score[index-1] = score[index-1]*score[index-1];
                            break;
                        case 'T':
                            score[index-1] = score[index-1]*score[index-1]*score[index-1];
                            break;
                        case '*':
                            if(index > 1){
                                score[index-2] *= 2;
                            }
                            score[index-1] *= 2;
                            break;
                        case '#':
                            score[index-1] *= -1;
                            break;
                    }      
                }
                
            }
            int answer = score[0] + score[1] + score[2];
            return answer;
        }
    }
}
