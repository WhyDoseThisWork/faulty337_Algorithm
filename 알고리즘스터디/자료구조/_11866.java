package 알고리즘스터디.자료구조;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _11866 {
    // 요세푸스 문제 0
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        CirQueue cq = new CirQueue(N);
        for(int i = 1; i <= N; i++){
            cq.push(i);
        }

        int temp = 0;
        sb.append('<');
        while(!cq.isEmpty()){
            for(int i = 0; i < K-1; i++){
                temp = cq.pop();
                cq.push(temp);
                
                
            }
            sb.append(""+cq.pop());
            if(!cq.isEmpty()){
                sb.append(", ");
            }
        }
        sb.append('>');
        System.out.println(sb);
    }
    static class CirQueue {
        int size;
        int front = 0, rear = 0;
        int[] q;
    
        public CirQueue(int size){
            this.size = size+1;
            this.q = new int[size+1];
        }
    
        public boolean isEmpty(){
            return front == rear;
        }
    
        public void push(int value){
            
            q[rear] = value;
            rear = (rear+1)%size;
        }
    
        public int pop(){
            int result = q[front%size];
            front = (front+1)%size;
            return result;
        }
    
    }
}