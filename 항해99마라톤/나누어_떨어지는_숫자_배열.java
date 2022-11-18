import java.util.ArrayList;
import java.util.List;

public class 나누어_떨어지는_숫자_배열 {
    public static void main(String[] args) throws Exception{
        int[] arr = {5, 9, 7, 10};
        for(int i : solution(arr, 5)){
            System.out.println(i);
        }
        System.out.println();

    }
    public static int[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>();
        for(int i : arr){
            if(i%divisor == 0){
                list.add(i);
            }
        }
        int[] answer = list.stream().sorted().mapToInt(i->i).toArray();
        return answer;
    }
}
