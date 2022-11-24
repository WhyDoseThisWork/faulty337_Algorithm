package HangHae99.Marathon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 정수_내림차순으로_배치하기 {
    public static void main(String[] args) throws Exception{
        long n = 21351652458L;
        System.out.println(solution(n));

    }
    public static long solution(long n) {
        List<Integer> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        while(n>=10){
            list.add((int)(n%10));
            n /= 10;
        }
        list.add((int)n);
        
        list.sort(Collections.reverseOrder()); //list 정렬
        for(int i : list)sb.append(i); //list를 String화
        long answer = Long.parseLong(sb.toString()); //String을 long으로 변환
        return answer;
    }
}
