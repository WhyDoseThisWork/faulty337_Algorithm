import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class 조합 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        ArrayList<ArrayList<Integer>> arr = makeCase(N);
        for(int i = 0; i < arr.size(); i++){
            for(int l = 0; l < arr.get(i).size(); l++){
                System.out.print(arr.get(i).get(l) + " ");
            }
            System.out.println();
        }
    }

    public static ArrayList<ArrayList<Integer>> makeCase(int N){
        int[] arr = {1, 2, 3, 4, 5};
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        for(int i = 1; i< (1<<N); i++){
            for(int j=0;j<arr.length;j++){
                if((i&1<<j) > 0){
                    // System.out.print(arr[j] + " ");
                    temp.add(arr[j]);
                }
            }
            result.add(temp);
            temp = new ArrayList<>();
            
        }

        return result;
    }


    
}
