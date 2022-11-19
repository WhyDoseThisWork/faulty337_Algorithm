package HangHae99.Challenge;

import java.util.Arrays;

public class 실패율 {
    public static void main(String[] args) throws Exception{
        int[] arr = {2, 1, 2, 6, 2, 4, 3, 3};
        for(int i : solution(5, arr))System.out.println(i);
        // System.out.println(solution(5, arr));
    }
    public static int[] solution(int N, int[] stages) {
        Integer[] temp = new Integer[N];
        for(int i = 1; i <= N; i++)temp[i-1] = i;
        double[] failRate = new double[N+1];
        int[] challenger = new int[N+1];
        for(int i : stages)if(i <= N)challenger[i]++;
        int fail = 0;
        for(int i = 1; i < N+1; i++){
            fail += challenger[i-1];
            if((stages.length - fail) > 0){
                failRate[i] = ((double)challenger[i] / (double)(stages.length - fail));
            }
            
        }


        Arrays.sort(temp, (x, y) -> {
            if( failRate[y] - failRate[x]== 0){
                return x - y;
            }else{
                if((failRate[y] - failRate[x]) > 0){
                    return 1;
                }else{
                    return -1;
                }
            }
        });
        int answer[] = Arrays.stream(temp).mapToInt(Integer::intValue).toArray(); 
        return answer;
    }

}
