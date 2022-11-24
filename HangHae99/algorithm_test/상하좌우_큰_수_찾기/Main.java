package HangHae99.algorithm_test.상하좌우_큰_수_찾기;


public class Main {
    public void solution(int[][] arr1) {
        String[][] answer = new String[5][5] ;
        int[][] dic = {{1, 0},{0, -1}, {-1, 0}, {0, 1}}; //방향
        int[][] map = new int[7][7]; //여백
        for(int i = 0; i < arr1.length; i++){
            for(int l = 0; l < arr1[i].length; l++){
                map[i+1][l+1] = arr1[i][l];
            }
        }
        int val;
        boolean check;
        for(int i = 1; i <= 5; i++){
            for(int l = 1; l <= 5; l++){
                val = map[i][l];
                check = true;
                for(int d = 0; d < 4; d++){
                    if(map[i+dic[d][0]][l+dic[d][1]] >= val){
                        check = false;
                    }
                }
                if(check){
                    answer[i-1][l-1] = "*";
                }else{
                    answer[i-1][l-1] = ""+val;
                }
            }
        }

        for(String[] arr : answer){
            for(String i : arr){
                System.out.print(i + " ");
            }
            System.out.println();
        }

        System.out.println();
    }

    public static void main(String[] args) {
        Main method = new Main();
        int[][] arr1 = {{3,4,1,4,9},{2,9,4,5,8},{9,0,8,2,1},{7,0,2,8,4},{2,7,2,1,4}};

        method.solution(arr1);
    }
}