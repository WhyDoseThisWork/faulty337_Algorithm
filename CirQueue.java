class CirQueue {
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