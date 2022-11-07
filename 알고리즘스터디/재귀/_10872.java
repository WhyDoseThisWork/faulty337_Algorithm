package 알고리즘스터디.재귀;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _10872 {
    //팩토리얼
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        System.out.println(getFactorial(N));
    }

    public static int getFactorial(int result){
        if(result <= 0){
            return 1;
        }
        return result * getFactorial(result-1);
    }
    

}
