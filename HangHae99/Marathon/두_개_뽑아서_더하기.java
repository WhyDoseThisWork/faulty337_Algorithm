package HangHae99.Marathon;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class 두_개_뽑아서_더하기 {
    public static void main(String[] args) throws Exception{
        // int n[] = {1, 1, 3, 3, 0, 1, 1};
        int n[] = {5, 0, 2, 7};
        for(int i : solution(n)){
            System.out.println(i);
        }
    }
    public static int[] solution(int[] numbers) {
        
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < numbers.length; i++){
            for(int l = i+1; l < numbers.length; l++){
                set.add(numbers[i]+numbers[l]);
                System.out.println(numbers[i] + " " +numbers[l]);
            }
        }
        List<Integer> list = new ArrayList<>(set);
        int[] answer = list.stream().sorted().mapToInt(i->i).toArray();
        return answer;
    }
}
