//Stack to Queue adapter

class MyQueue {
     Stack<Integer> mainStack;
     Stack<Integer> helperStack;
    /** Initialize your data structure here. */
    public MyQueue() {
         mainStack = new Stack();
         helperStack = new Stack();
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        while(mainStack.size()>0){
            helperStack.push(mainStack.pop());
        }
        mainStack.push(x);
        
        while(helperStack.size()>0){
            mainStack.push(helperStack.pop());
        }
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if(mainStack.size()==0){
            System.out.println("Stack underflow");
            return -1;
        }
        else{
           return mainStack.pop();
        }
    }
    
    /** Get the front element. */
    public int peek() {
          if(mainStack.size()==0){
            System.out.println("Stack underflow");
            return -1;
        }
        else{
         return mainStack.peek();
        }
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        if(mainStack.size()==0){
            return true;
        }
        else{
            return false;
        }
    }
}

//Input
//["MyQueue", "push", "push", "peek", "pop", "empty"]
//[[], [1], [2], [], [], []]
//Output
//[null, null, null, 1, 1, false]
