package HangHae99.Marathon;



public class 수박수박수박수박수박수 {
    public static void main(String[] args) throws Exception{
        System.out.println(solution(3));

    }
    public static String solution(int n) {
        String even = "수박";
        String odd = "수";
        String answer = even.repeat(n/2) + odd.repeat(n%2);
        //repeat -> 매개변수만큼 해당 String 반복해서 반환
        return answer;
    }
}
