package HangHae99.Marathon;

public class 숫자_문자열과_영단어 {
    public static void main(String[] args) throws Exception{
        String s = "one4seveneight";
        System.out.println(solution(s));
    }
    public static int solution(String s) {
        String[] num = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for(int i = 0; i < 10; i++){
            s = s.replaceAll(num[i], Integer.toString(i));
        }
        int answer = Integer.parseInt(s);
        return answer;
    }
}
