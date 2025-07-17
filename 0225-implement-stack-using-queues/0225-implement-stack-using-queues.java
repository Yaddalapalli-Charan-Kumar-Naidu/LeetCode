class MyStack {
    int top=0;
        int[] stack=new int[10000];

    public MyStack() {
    }
    
    public void push(int x) {   
        stack[top]=x;
        top++;
    }
    
    public int pop() {
        if(top>0)
        return stack[--top];
        return -1;
    }
    
    public int top() {
        if(top>0)
        return stack[top-1];
        return -1;
    }
    
    public boolean empty() {
        return top==0;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */