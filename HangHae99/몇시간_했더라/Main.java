package HangHae99.몇시간_했더라;

public class Main {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        for(int i = 0; i < arr2.length; i++ ){
            if(arr2[i] > 28)arr2[i] = 21;
            answer += arr2[i] - arr1[i];
        }
        
        return answer;
    }

    public static void main(String[] args) {
        Main method = new Main();
        int[] arr1 = {9, 9, 8, 8, 7, 8, 9};
        int[] arr2 = {21, 25, 30, 29, 22, 23, 30};
        
        System.out.println(method.solution(arr1, arr2));
    }
}