import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.StringTokenizer;



public class Main {
    //모양 만들기
    static int N, M;
    static int[][] dir = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
    public static void main(String[] arg) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken()); //String.charAt 에 인덱스값을 넣은 후 아스키코드 갑중 '0'을 빼 기존 값으로 설정
        M = Integer.parseInt(st.nextToken());
        boolean[][] visit = new boolean[N+2][M+2];
        int[][][] arr = new int[N+2][M+2][2];
        int answer = 1;
        int groupNum = 1;

         //방문 초기화
        for (boolean[] bs : visit) {
            Arrays.fill(bs, true);
        }
        for(int i = 1; i <= N; i++){ 
            st = new StringTokenizer(br.readLine());
            for(int l = 1; l <= M; l++){
                arr[i][l][0] = Integer.parseInt(st.nextToken()); //입력
                visit[i][l] = false; //방문 설정
            }
        }

        for(int i =1; i<=N; i++){
            for(int l = 1; l <= M; l++){
                if(!visit[i][l] && arr[i][l][0] > 0){
                    DFS(visit, arr, i, l, groupNum);
                    groupNum++;
                }
            }
        }
        List<Integer> groupList = new ArrayList<>();
        int cost;
        for(int i =1; i<=N; i++){
            for(int l = 1; l <= M; l++){
                if(!visit[i][l]){
                    cost = 0;
                    for(int d = 0; d < 4; d++){
                        if(arr[i + dir[d][0]][l+dir[d][1]][0] > 0 && groupList.indexOf(arr[i + dir[d][0]][l+dir[d][1]][1]) == -1 ){
                            cost += arr[i + dir[d][0]][l+dir[d][1]][0];
                            groupList.add(arr[i + dir[d][0]][l+dir[d][1]][1]);
                        }
                    }
                    groupList.clear();
                    answer = Math.max(answer, cost+1);
                }
            }
        }
        System.out.println(answer);

    }



    public static void DFS(boolean[][] visit, int[][][] arr, int x, int y, int groupNum){
        Stack<int[]> stack = new Stack<>(); //stack이용
        Stack<int[]> connected = new Stack<>();
        stack.push(new int[] {x, y});
        connected.push(new int[] {x, y});
        visit[x][y] = true;
        int[] value;
        int valueX, valueY;
        int size = 1;
        while(!stack.empty()){
            value = stack.pop();
            for(int i = 0; i < 4; i++){
                valueX = value[0] + dir[i][0];
                valueY = value[1] + dir[i][1];
                if(!visit[valueX][valueY] && arr[valueX][valueY][0] > 0){
                    size++;
                    visit[valueX][valueY] = true;
                    stack.push(new int[] {valueX, valueY});
                    connected.push(new int[] {valueX, valueY});
                }
            }
        }
        while(!connected.empty()){
            value = connected.pop();
            arr[value[0]][value[1]][0] = size;
            arr[value[0]][value[1]][1] = groupNum;
        }
    }
    

}



