public class Queue {
    private int front, rear;
    private int[] q;

    Queue(int max){
        q = new int[max];
        front = 0;
        rear = 0;
    }

    public boolean isEmpty(){
        return front == rear;
    }

    public int size(){
        return rear - front;
    }

    public void push(int data){
        q[rear] = data;
        rear++;
    }

    public int pop(){
        int data = q[front];
        front++;
        return data;
    }

}
