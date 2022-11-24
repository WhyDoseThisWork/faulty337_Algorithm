package HangHae99.mock_test.소수의_개수와_덧셈;

import java.util.Arrays;
import java.util.TreeSet;

public class Main {
    public String solution(String s) {
        boolean[] prime = new boolean[10000];
        Arrays.fill(prime,true); //소수 배열 초기화
        TreeSet<Integer> primeSet = new TreeSet<Integer>();
        TreeSet<Integer> notPrimeSet = new TreeSet<Integer>();
        prime[0] = false;
        prime[1] = false;
        //소수 배열 세팅
        for(int i = 2; i < 10000; i++){
            if(prime[i]){
                for(int l = i+i; l< 10000; l+=i){
                    prime[l] = false;
                }
                if(i*i > 10000)break;
            }
        }
        int[] temp = Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).toArray();
        for(int i : temp){
            if(prime[i]){
                primeSet.add(i);
            }else{
                notPrimeSet.add(i);
            }
        }
        String answer = notPrimeSet.first() + " " + primeSet.last();
        return answer;
    }

    public static void main(String[] args) {
        Main method = new Main();
        String s = "97 75 88 99 95 92 73";
        System.out.println(method.solution(s));
    }
}