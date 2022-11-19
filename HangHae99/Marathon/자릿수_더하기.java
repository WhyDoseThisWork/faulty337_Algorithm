public class 자릿수_더하기 {
    public static void main(String[] args) throws Exception{

        System.out.println(solution(10));

    }
    public static int solution(int n) {
        int answer = 0;
        while(n>=10){
            answer += n%10;
            n /= 10;
        }
        answer += n;
        return answer;
    }
}
