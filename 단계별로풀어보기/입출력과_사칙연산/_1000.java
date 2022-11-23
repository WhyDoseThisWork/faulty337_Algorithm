package 단계별로풀어보기.입출력과_사칙연산;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _1000 {
    //A+B
    public static void main(String[] arg) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int A = Integer.parseInt(input[0]);
        int B = Integer.parseInt(input[1]);
        System.out.println(A+B);
    }
}
