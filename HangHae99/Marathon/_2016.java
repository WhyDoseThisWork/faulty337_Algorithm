package HangHae99.Marathon;

public class _2016 {
    public static void main(String[] args) throws Exception{
        System.out.println(solution(11, 27));

    }
    public static String solution(int a, int b) {
        int month[] = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String week[] = {"SUN", "MON", "TUE", "WED" ,"THU", "FRI", "SAT" };
        int day = 0;
        for(int i = 0; i < a-1; i++){
            day += month[i];
        }
        String answer = week[(day+b+4)%7]; // 전체일수/7
        return answer;
    }
}
