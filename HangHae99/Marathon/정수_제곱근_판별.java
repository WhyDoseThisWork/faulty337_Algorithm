package HangHae99.Marathon;


public class 정수_제곱근_판별 {
    public static void main(String[] args) throws Exception{
        long n = 11L;
        System.out.println(solution(n));

    }
    public static long solution(long n) {
        long answer = 0;
        for(long i = 1; i < 7500000; i++){ //7,500,000*7,500,000 이 50,000,000,000,000 안넘어감
            if(i*i == n){
                answer = (i+1)*(i+1);
            }
        }
        if(answer == 0){
            return -1;
        }
        return answer;
    }
}
