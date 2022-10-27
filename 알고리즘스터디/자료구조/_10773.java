package 알고리즘스터디.자료구조;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class _10773 {
    // 제로
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());
        Stack<Integer> st = new Stack<>();
        long answer = 0;
        for(int i = 0; i < K; i++){
            int temp = Integer.parseInt(br.readLine());
            if(temp == 0){
                st.pop();
            }else{
                st.push(temp);
            }
        }
        while(!st.empty()) answer += st.pop();
        System.out.println(answer);
    }


    //statk 미사용
    public static void sub() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());
        int[] st = new int[K];
        int top = 0;
        for(int i = 0; i < K; i++){
            int temp = Integer.parseInt(br.readLine());
            if(temp == 0){
                top--;
            }else{
                st[top++] = temp;
            }
        }
        long answer = 0;


        
        while(top-- > 0) {
            answer += st[top];
        }
        System.out.println(answer);
        
    }
}
