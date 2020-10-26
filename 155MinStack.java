
class MinStack {

    /** initialize your data structure here. */
    private Stack<Integer> stack; // store all the values
    private Stack<Integer> minStack; // store the min values
    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }
    
    public void push(int x) {
        stack.push(x); // push every value to 'stack'
        
        if(!minStack.isEmpty()){
            //compare value, if smaller than current minstack peek(), then push the new min value
            if(x <= minStack.peek()){
                minStack.push(x);
            }
        }else{
            //min stack is empty
            minStack.push(x);
        }
    }
    
    public void pop() {
        int pop = stack.pop(); //pop the value from 'stack'
        int minStackTop = minStack.peek();
        
        if(pop == minStackTop) minStack.pop(); // if same value, then pop from minStack also
        
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
