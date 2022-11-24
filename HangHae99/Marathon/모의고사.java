package HangHae99.Marathon;

public class 모의고사 {
    public static void main(String[] args) throws Exception{
        // int n[] = {1, 1, 3, 3, 0, 1, 1};
        int n[] = {1, 3, 2, 4, 2};
        for(int i : solution(n)){
            System.out.println(i);
        }
    }
    public static int[] solution(int[] answers) {
        int[][] sufo = {
            {1, 2, 3, 4, 5},
            {2, 1, 2, 3, 2, 4, 2, 5},
            {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
        };

        int score[] = new int[3];

        for(int i = 0; i < 3; i++){
            for(int l = 0; l < answers.length; l++){
                if(answers[l] == sufo[i][l%sufo[i].length])score[i]++;
            }
        }
        int max = 0;
        int cnt = 0;
        for(int i = 0; i < 3; i++){
            if(max < score[i]){
                max = score[i];
                cnt = 1;
            }else if(max == score[i])cnt++;
        }
        int[] answer = new int[cnt];
        int index = 0;
        for(int i = 1; i <= 3; i++){
            if(score[i-1] == max){
                answer[index++] = i;
            }
        }
        return answer;
    }
}
