class MyStack {
    Queue<Integer> q1;
    public MyStack() {
        q1 = new LinkedList<>();
    }
    
    public void push(int x) {
        q1.add(x);
    }
    
    public int pop() {
        for (int i = 1; i < q1.size(); i++) {
            q1.add(q1.remove());
        }
        return q1.remove();
    }
    
    public int top() {
        for (int i = 1; i < q1.size(); i++) {
            q1.add(q1.remove());
        }
        int x = q1.peek();
        q1.add(q1.remove());
        return x;
    }
    
    public boolean empty() {
        return q1.size() == 0;
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