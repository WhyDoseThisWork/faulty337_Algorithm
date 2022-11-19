

public class 하샤드_수 {
    public static void main(String[] args) {
        System.out.println(solution(11));
    }


    public static boolean solution(int x) {
        int sum = 0;
        int temp = x;
        while(temp >= 10){
            sum += temp%10;
            temp /= 10;
        }
        sum += temp;
        if(x%sum == 0)return true;
        return false;
    }
}
