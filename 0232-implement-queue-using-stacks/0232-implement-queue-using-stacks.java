class MyQueue {
    int[] queue=new int[10000];
    int front;
    int rear;
    public MyQueue() {
        front=0;
        rear=0;
    }
    
    public void push(int x) {
        queue[rear++]=x;
    }
    
    public int pop() {
        if(front==rear){
            return -1;
        }
        return queue[front++];
    }
    
    public int peek() {
        if(front==rear){
            return -1;
        }
        return queue[front];
    }
    
    public boolean empty() {
        return front==rear;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */