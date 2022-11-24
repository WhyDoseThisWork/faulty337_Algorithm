package HangHae99.mock_test.신대륙_발견;


public class Main {
    public String solution(int month, int day) {
        int monthArr[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int total = 98 - (monthArr[--month] - day);
        while(monthArr[(++month)%12] < total){
            total -= monthArr[(month)%12];
        }
        String answer = (month)%12+1 + "월 " + total + "일";
        return answer;
    }

    public static void main(String[] args) {
        Main method = new Main();
        System.out.println(method.solution(1, 18));
    }
}


