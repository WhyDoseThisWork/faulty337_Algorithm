package HangHae99.Marathon;

import java.util.ArrayList;
import java.util.List;

public class 자연수_뒤집어_배열로_만들기 {
    public static void main(String[] args) throws Exception{
        long n = 21351652458L;
        for(long i : solution(n)){
            System.out.println(i);
        }

    }
    public static int[] solution(long n) {
        List<Integer> list = new ArrayList<>();
        while(n >= 10){
            list.add((int)(n%10));
            n = n/10;
        }
        list.add((int)n);
        int[] answer = list.stream().mapToInt(i->i).toArray();
        return answer;
    }
}
