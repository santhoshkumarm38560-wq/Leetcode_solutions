class MinStack {
    Stack<Long> st=new Stack<>();
    long min=Long.MAX_VALUE;
    public MinStack() {
        
    }
    
    public void push(int value) {
        if (st.isEmpty()){
            st.push((long)value);
            min=(long)value;
            return;
        }
        else{
            if (value>min){
                st.push((long)value);
            }
            else{
                st.push(2L*value-min);
                min=(long)value;
            }
        }
    }
    
    public void pop() {
        if (st.isEmpty()){
            return;
        } 
        long x=st.peek();
        st.pop();
        if (x<min){
            min=2L*min-x;
        }
    }
    
    public int top() {
        if (st.isEmpty()){
            return 0;
        } 
        long x=st.peek();
        if (x<min){
            return (int) min;
        }
        return (int)x;
    }
    
    public int getMin() {
        if (st.isEmpty()){
            return 0;
        }
        return (int)min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */