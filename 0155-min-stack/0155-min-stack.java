class MinStack {
    private ArrayList<Integer> list;
    private ArrayList<Integer> minList;
    private int size;
    
    public MinStack() {
        list = new ArrayList<>();
        minList = new ArrayList<>();
        size = 0;
    }
    
    public void push(int val) {
        list.add(val);
        if (size == 0) {
            minList.add(val);
        } else {
            // Push the smaller of the current value and the current minimum to minList
            minList.add(Math.min(val, minList.get(size - 1)));
        }
        size++;
    }
    
    public void pop() {
        if (size > 0) {
            list.remove(size - 1);
            minList.remove(size - 1);
            size--;
        }
    }
    
    public int top() {
        if (size > 0) {
            return list.get(size - 1);
        }
        return -1;  // or throw an exception
    }
    
    public int getMin() {
        if (size > 0) {
            return minList.get(size - 1);
        }
        return -1;  // or throw an exception
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