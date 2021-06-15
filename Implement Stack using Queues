//queue to stack adapter

class MyStack {
    
    Queue <Integer> mainQ;
    Queue <Integer> helperQ;
    
    /** Initialize your data structure here. */
    public MyStack() {
        mainQ = new  ArrayDeque <> ();
        helperQ = new ArrayDeque <> ();
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
     mainQ.add(x);
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        if(mainQ.size()==0){
            System.out.println("Stack underflow");
            return -1;
        }
        else{
          while(mainQ.size()>1){
              helperQ.add(mainQ.remove());
          }
            int popans = mainQ.remove();
            
        while(helperQ.size()>0){
            mainQ.add(helperQ.remove());
        }
        return popans;
    }
    }
    /** Get the top element. */
    public int top() {
          if(mainQ.size()==0){
            System.out.println("Stack underflow");
            return -1;
        }
        else{
            while(mainQ.size()>1){
              helperQ.add(mainQ.remove());
          }
            int popans = mainQ.remove();
            helperQ.add(popans);
        while(helperQ.size()>0){
            mainQ.add(helperQ.remove());
        }
        return popans;
        }
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        if(mainQ.size()==0){
            return true;
        }
        else{
            return false;
        }
    }
}

//Input
//["MyStack", "push", "push", "top", "pop", "empty"]
//[[], [1], [2], [], [], []]
//Output
//[null, null, null, 2, 2, false]
