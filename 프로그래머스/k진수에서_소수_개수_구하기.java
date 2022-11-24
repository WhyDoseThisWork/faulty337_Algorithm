package 프로그래머스;

import java.util.StringTokenizer;

public class k진수에서_소수_개수_구하기 {
    public static void main(String[] arg) throws Exception{
        System.out.println(solution(1000000, 5));
    }
    public static int solution(int n, int k) {
        int answer = 0;
        StringTokenizer str = new StringTokenizer(Integer.toString(n, k), "0");
        long s;
        for(int i = 0; str.hasMoreElements(); i++){
            s = Long.parseLong(str.nextToken());
            System.out.println(s);
            if(isPrime(s) && s != 1){
                answer++;
            }
        }
        
        return answer;
    }
    public static boolean isPrime(long n) {
        for (long i = 2; i<=(long)Math.sqrt(n); i++) {
          if (n % i == 0) {
              return false;
          }
        }
        return true;
    }
}
