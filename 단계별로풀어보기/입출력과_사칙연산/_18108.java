package 단계별로풀어보기.입출력과_사칙연산;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _18108 {
    //1998년생인 내가 태국에서는 2541년생?!
    public static void main(String[] arg) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int year = Integer.parseInt(br.readLine());
        System.out.println(year-543);
    }
}
