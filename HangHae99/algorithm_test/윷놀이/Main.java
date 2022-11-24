package HangHae99.algorithm_test.윷놀이;

import java.util.Arrays;
public class Main {
    public String solution(int[] arr1) {
        String answer = "";
        String[] str = {"윷", "걸", "개", "도", "모"};
        int sum = Arrays.stream(arr1).sum();
        answer = str[sum];

        return answer;
    }

    public static void main(String[] args) {
        Main method = new Main();
        int[] arr1 = {0,1,0,0};
        System.out.println(method.solution(arr1));
    }
}