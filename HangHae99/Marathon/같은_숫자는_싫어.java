package HangHae99.Marathon;

import java.util.ArrayList;
import java.util.List;

public class 같은_숫자는_싫어 {
    public static void main(String[] args) throws Exception{
        // int n[] = {1, 1, 3, 3, 0, 1, 1};
        int n[] = {4, 4, 4, 3, 3};
        for(int i : solution(n)){
            System.out.println(i);
        }
    }
    public static int[] solution(int []arr) {
        List<Integer> list = new ArrayList<>();
        int temp = 10;
        for(int i : arr){
            if(i != temp){
                temp = i;
                list.add(i);
            }
        }
        int[] answer = list.stream().mapToInt(i->i).toArray();
        
        return answer;
    }
}
