package HangHae99.Challenge;

public class _1차_비밀지도 {
    
    public static void main(String[] args) throws Exception{
        int[] arr = {9, 20, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};
        Solution s = new Solution();
        for(String str :s.solution(5, arr, arr2))System.out.println(str);
        // System.out.println(s.solution(5, arr, arr2));
    }
    static class Solution {
        public String[] solution(int n, int[] arr1, int[] arr2) {
            String[] answer = new String[n];
            String[] map1 = new String[n];
            String[] map2 = new String[n];
            for(int i = 0; i < n; i++){
                map1[i] = String.format("%"+n+"s", Integer.toString(arr1[i], 2)).replace(" ", "0");
            }
            for(int i = 0; i < n; i++){
                map2[i] = String.format("%"+n+"s", Integer.toString(arr2[i], 2)).replace(" ", "0");
            }
            String line;
            for(int i = 0; i < n; i++){
                line = "";
                for(int l = 0; l < n; l++){
                    if(map1[i].charAt(l) == '0' && map2[i].charAt(l) == '0'){
                        line += ' ';
                    }else{
                        line += '#';
                    }
                }
                answer[i] = line;
                
            }
           
            return answer;
        }
    }
}
