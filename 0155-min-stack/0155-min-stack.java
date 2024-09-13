class MinStack {
    private Stack<Integer> valStack;
    private Stack<Integer> minValStack;

    public MinStack() {
       valStack = new Stack<>();
       minValStack = new Stack<>();
    }
    
    public void push(int val) {
        valStack.push(val);
        if(minValStack.size()==0){
            minValStack.push(val);
        }
        else{
           // Math.min(val,)
            minValStack.push(Math.min(val,minValStack.peek()));
        }
    }
    
    public void pop() {
        valStack.pop();
        minValStack.pop();
    }
    
    public int top() {
        return valStack.peek();
    }
    
    public int getMin() {
        return minValStack.peek();
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