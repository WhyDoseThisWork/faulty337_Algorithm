package HangHae99.Marathon;



public class 최소직사각형 {
    public static void main(String[] args) throws Exception{
        // int n[][] = {{60, 50}, {30, 70},{60, 30}, {80, 40}};
        int n[][] = {{3,5}, {6,2}};
        System.out.println(solution(n));
    }
    public static int solution(int[][] sizes) {
        int l = 0, s = 0;
        int answer;
        for(int[] arr : sizes){
            if(arr[0] > arr[1]){
                l = Math.max(arr[0], l);
                s = Math.max(arr[1], s);
            }else{
                l = Math.max(arr[1], l);
                s = Math.max(arr[0], s);
            }
        }
        System.out.println(l + " " + s);
        answer = l*s;


        return answer;
        
    }
}
