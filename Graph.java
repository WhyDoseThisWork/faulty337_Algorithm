import java.util.Stack;
class Pair{
    int first;
    int second;
    public Pair(int f, int s){
        this.first = f;
        this.second = s;
    }
}
public class Graph {
    static int[][] dir = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}}; //4방향 좌표 
    

    public static void main(String[] arg) throws Exception{

    }


    //2차원배열 깊은 복사(배열의 자료형은 따로 수정해야함)
    public static boolean[][] deepCopy(boolean[][] original) {
        if (original == null) {
            return null;
        }
        boolean[][] result = new boolean[original.length][original[0].length];
        for (int i = 0; i < original.length; i++) {
            System.arraycopy(original[i], 0, result[i], 0, original[i].length);
        }
        return result;
    }

    //스택이용 DFS
    public static int DFS(boolean[][] visit, int[][] arr, int x, int y){
        Stack<Pair> stack = new Stack<>(); //stack이용
        stack.push(new Pair(x, y));
        visit[x][y] = true;
        Pair value;
        int valueX, valueY;
        int size = 1;
        while(!stack.empty()){
            value = stack.pop();
            
            for(int i = 0; i < 4; i++){
                valueX = value.first + dir[i][0];
                valueY = value.second + dir[i][1];
                if(!visit[valueX][valueY] && arr[valueX][valueY] ==1){
                    size++;
                    visit[valueX][valueY] = true;
                    stack.push(new Pair(valueX, valueY));
                }
            }
        }

        return size;
    }
    
}
