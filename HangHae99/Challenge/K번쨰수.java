package HangHae99.Challenge;

import java.util.Arrays;

public class K번쨰수 {
    public static void main(String[] args) throws Exception{
        int[] arr = {1, 5, 2, 6, 3, 7, 4};
        int[][] arr2 = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        for(int i : solution(arr, arr2))System.out.println(i);
    }
    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int index = 0;
        for(int[] arr : commands){
            int[] temp = Arrays.copyOfRange(array, arr[0]-1, arr[1]);
            Arrays.sort(temp);
            answer[index++] = temp[arr[2]-1];
        }
        
        return answer;
    }
}
