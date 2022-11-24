package HangHae99.Marathon;



public class 콜라츠_추측 {
    public static void main(String[] args) {
        System.out.println(solution(626331));
    }
    public static int solution(int num) {
        int answer = 501;
        long n = num;
        for(int i = 0; i < 500; i++){
            if(n == 1){
                answer = i;
                break;
            }
            if(n%2==0){
                n /= 2;
            }else{
                n = n*3+1;
            }
            
        }
        if(answer == 501){
            return -1;
        }

        return answer;
    }
}
