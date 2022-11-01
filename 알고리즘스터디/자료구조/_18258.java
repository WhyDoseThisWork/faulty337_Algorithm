package 알고리즘스터디.자료구조;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class _18258 {
    // 큐2
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int front=0, back=0;
        StringTokenizer st;
        String commend;
        int[] q = new int[N];
        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            commend = st.nextToken();
            if(commend.equals("push")){
                q[back++] = Integer.parseInt(st.nextToken());
            }else if(commend.equals("size")){
                sb.append("" + (back - front) + "\n");
            }else if(commend.equals("empty")){
                if(back-front == 0){
                    sb.append("" + 1+ "\n");
                }else{
                    sb.append(""+0+"\n");
                }
            }else if(back-front ==0){
                sb.append("" + -1 + "\n");
            }else if(commend.equals("pop")){
                sb.append("" + q[front++] + "\n");
            }else if(commend.equals("front")){
                sb.append("" + q[front] + "\n");
            }else if(commend.equals("back")){
                sb.append("" + q[back-1] + "\n");
            }
        }
        System.out.print(sb.toString());
        
    }

    public static void sub(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Queue<Integer> q = new LinkedList<Integer>();
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        String commend;
        int back = 0;
        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            commend = st.nextToken();
            if(commend.equals("push")){
                back = Integer.parseInt(st.nextToken());
                q.add(back);
            }else if(commend.equals("size")){
                sb.append("" + q.size() + "\n");
            }else if(commend.equals("empty")){
                if(q.isEmpty()){
                    sb.append("" + 1+ "\n");
                }else{
                    sb.append("" + 0+ "\n");
                }
            }else if(q.isEmpty()){
                sb.append("" + -1 + "\n");
            }else if(commend.equals("pop")){
                sb.append("" + q.poll() + "\n");
            }else if(commend.equals("front")){
                sb.append("" + q.peek() + "\n");
            }else if(commend.equals("back")){
                sb.append("" + back + "\n");
            }
        }
        System.out.print(sb.toString());
        
    }
}