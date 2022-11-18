
import java.util.ArrayList;
import java.util.List;

public class 제일_작은_수_제거하기 {
    public static void main(String[] args) throws Exception{
        int[] n = {1, 2, 3, 4, 5, 6};
        System.out.println(solution(n));

    }
    public static int[] solution(int[] arr) {
        
        List<Integer> list = new ArrayList<>();
        int min = arr[0];
        int minIndex = 0;
        for(int i = 0; i < arr.length; i++){
            list.add(arr[i]);
            if(min > arr[i]){
                min = arr[i];
                minIndex = i;
            }
        }
        int[] answer = {-1};
        list.remove(minIndex);
        if(list.isEmpty()){
            return answer;
        }
        
        answer = list.stream().mapToInt(i->i).toArray();
        return answer;
    }
}
