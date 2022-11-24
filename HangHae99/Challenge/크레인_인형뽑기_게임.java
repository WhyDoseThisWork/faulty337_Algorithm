package HangHae99.Challenge;

import java.util.Stack;

class 크레인_인형뽑기_게임 {
        public int solution(int[][] board, int[] moves) {
            Stack<Integer> st = new Stack<>();
            st.push(101);
            int answer = 0;
            int dol;
            for(int i : moves){
                for(int f = 0; f < board.length; f++){
                    dol = board[f][i-1];
                    if(dol != 0){
                        if(st.peek() != dol){
                            st.push(dol);
                            board[f][i-1] = 0;
                            
                        }else{
                            st.pop();
                            answer++;
                            board[f][i-1] = 0;
                        }
                        break;
                    }
                }
            }
            
            
            return answer*2;
        }
}