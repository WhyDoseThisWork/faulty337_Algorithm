package HangHae99.Marathon;

import java.util.Arrays;
import java.util.List;

public class 문자열_내_마음대로_정렬하기 {
    public static void main(String[] args) throws Exception{
        String[] s = {"sun", "bed", "car"};
        for(String i : solution(s, 1)){
            System.out.println(i);
        }
    }
    public static String[] solution(String[] strings, int n) {
        List<String> list = Arrays.asList(strings);
        list.sort((s1, s2)->{
            if(s1.charAt(n) - s2.charAt(n) == 0){
                return s1.compareTo(s2);
            }
            return s1.charAt(n) - s2.charAt(n);
        });
        String[] answer = list.stream().toArray(String[]::new);
        return answer;
    }
}
