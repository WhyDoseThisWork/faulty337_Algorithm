package HangHae99.Challenge;

public class 약수의_개수와_덧셈 {
    public static void main(String[] args) throws Exception{
        int var1 = 13;
        int var2 = 17;
        System.out.println(solution(var1, var2));
    }
    public static int solution(int left, int right) {
        int answer = 0;
        int count;
        for(int i = left; i <= right; i++){
            count = 0;
            for(int l = 1; l <= i; l++){
                if(i%l == 0){
                    count++;
                }
            }
            if(count%2 == 0){
                answer += i;
            }else{
                answer -= i;
            }
        }
        return answer;
    }
}
