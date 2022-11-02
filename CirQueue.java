class CirQueue {
    int size;
    int front = 0, rear = 0;
    int[] q;

    CirQueue(int size){
        this.size = size;
        this.q = new int[size+1];
    }

    public boolean isEmpty(){
        return front == rear;
    }

    public int size(){
        if(front > rear){
            return (size - front) + rear;
        }else{
            return rear - front;
        }
    }

    public void push(int data){
        q[rear%size] = data;
        rear = (rear+1)%(size+1);
    }

    public int pop(){
        int data = q[front%size];
        front = (front+1)%(size+1);
        return data;
    }

}