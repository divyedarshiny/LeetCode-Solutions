class MyStack {

    Queue<Integer> primaryQueue = new LinkedList<>();
    Queue<Integer> secondaryQueue = new LinkedList<>();
    
    public void push(int x) {
        primaryQueue.offer(x);
        while(!secondaryQueue.isEmpty()){
            primaryQueue.offer(secondaryQueue.poll());
        }
        Queue<Integer> temp = primaryQueue;
        primaryQueue = secondaryQueue;
        secondaryQueue = temp;
    }
    
    public int pop() {
        if(empty()){
            return -1;
        }
        return secondaryQueue.poll();
    }
    
    public int top() {
        if(empty()){
            return -1;
        }
        return secondaryQueue.peek();
        
    }
    
    public boolean empty() {
        return secondaryQueue.isEmpty();
    }
}