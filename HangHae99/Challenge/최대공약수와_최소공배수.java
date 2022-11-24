package HangHae99.Challenge;

public class 최대공약수와_최소공배수 {
    public static void main(String[] args) throws Exception{
        int var1= 3;
        int var2 = 12;
        for(int i : solution(var1, var2))System.out.println(i);
    }
    public static int[] solution(int n, int m) {
        
        int b = Math.max(n, m);
        int s = Math.min(n, m);
        int r = 1;
        while(r != 0){ //유클리드 호제법
            r = b%s;
            b = s;
            s = r;
        }
        int[] answer = {b, m*n/b};
        
        return answer;
    }
}
