import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 문자열_내림차순으로_배치하기 {
    public static void main(String[] args) throws Exception{
        String s = "Zbcdefg";
        System.out.println(solution(s));
    }
    public static String solution(String s) {
        List<Integer> str = new ArrayList<>();
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < s.length(); i++){
            str.add((int)s.charAt(i));
        }
        str.sort(null);
        for(int i : str){
            sb.append((char)i);
        }
        String answer = sb.reverse().toString();
        return answer;
    }
    public static String solution2(String s) {
        List<String> str = Arrays.asList(s.split(""));
        StringBuilder sb = new StringBuilder();
        str.sort(null);
        for(String t : str){
            sb.append(t);
        }
        String answer = sb.reverse().toString();
        return answer;
    }
}
