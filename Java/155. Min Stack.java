class MinStack {
    Stack<Integer> minStack = new Stack<>();
    Stack<Integer> mainStack = new Stack<>();

    public MinStack() {   
    }
    
    public void push(int val) {
        mainStack.push(val);
        if(minStack.isEmpty() || val<=minStack.peek()){
            minStack.push(val);
        }
        
    }
    
    public void pop() {
        if(!mainStack.isEmpty()){
            if(mainStack.peek().equals(minStack.peek())){
                minStack.pop();
            }
            mainStack.pop();
        }
    }
    
    public int top() {
        if(!mainStack.isEmpty()){
            return mainStack.peek();
        }
        return -1;
        
    }
    
    public int getMin() {
        if(!minStack.isEmpty()){
            return minStack.peek();
        }
        return -1;
    }
}