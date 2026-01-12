class MinStack {

    Stack<Integer> stack = new Stack<>();
        Stack<Integer> min = new Stack<>();
    public MinStack() {
        
    }
    
    public void push(int val) {
        stack.push(val);
        if(min.isEmpty() || val <=min.peek())
        min.push(val);
    }
    
    public void pop() {
        if(stack.pop().equals(min.peek())) min.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return min.peek();
    }

    public static void Main(String[] args){
        MinStack obj = new MinStack();
        int val = 0;
        obj.push(val);
         obj.pop();
         int param_3 = obj.top();
        int param_4 = obj.getMin();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */