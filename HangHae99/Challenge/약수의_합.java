package HangHae99.Challenge;

public class 약수의_합 {
    public static void main(String[] args) throws Exception{
        int var1 = 1;
        System.out.println(solution(27));
    }
    public static int solution(int n) {
        int answer = 0;
        for(int i = 1; i <= n; i++){
            if(n%i == 0){
                answer += i;
                System.out.println(i);
            }
        }
        return answer;
    }
}
