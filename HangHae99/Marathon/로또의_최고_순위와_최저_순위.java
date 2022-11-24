package HangHae99.Marathon;

public class 로또의_최고_순위와_최저_순위 {
    public static void main(String[] args) throws Exception{
        // int n[] = {1, 1, 3, 3, 0, 1, 1};
        int n[] = {31, 10, 45, 1, 6, 19};
        int m[] = {44, 1, 0, 0, 31, 25};
        
        for(int i : solution(m, n)){
            System.out.println(i);
        }
    }
    public static int[] solution(int[] lottos, int[] win_nums) {
        int same = 0;
        int zero = 0;
        boolean[] lotto = new boolean[46];
        for(int i : win_nums){
            lotto[i] = true;
        }
        for(int i : lottos){
            if(i == 0){
                zero++;
                continue;
            }
            if(lotto[i]){
                same++;
            }
        } //맞은 개수, 틀린 개수, 0 개수 세기
        int max = 6 - (same + zero)+1;
        if(max > 6)max=6;
        int min = 6 - same + 1;
        if(min > 6)min=6;
        int[] answer = {max, min};
        //등수 정하기
        return answer;
    }
}
