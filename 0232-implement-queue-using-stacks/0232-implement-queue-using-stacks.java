class MyQueue {
    
    Stack<Integer> first = new Stack<>();     // Two new stacks to store and reverse
    Stack<Integer> second = new Stack<>();
    

    public MyQueue() {                        // Constructor
        first = new Stack<>();
        second = new Stack<>();
    }
    
    public void push(int x) {                 // push is simply from last of queue
        first.push(x);
    }
    
    public int pop() {                        // But pop is from front and stack pops from last
       
        while(!first.empty()){        // Empty first in second
            second.push(first.pop());
        }
        
        int popped = second.pop();    // save the top of the second stack as it is the first element of first stack                                              whick is to be popped
        
          while(!second.empty()){     // Again reverse to origional stricture
            first.push(second.pop());
        }
        
        return popped;                // return the popped
    }
    
    public int peek() {
        
          while(!first.empty()){       // same as pop but it returns the peek
            second.push(first.pop());
        }
        
        int peeked = second.peek();
        
          while(!second.empty()){
            first.push(second.pop());
        }
        
        return peeked; 
    }
    
    public boolean empty() {
        return first.empty();
    }
}


// class MyQueue {

//     Stack<Integer> input = new Stack();
//     Stack<Integer> output = new Stack();
    
//     public void push(int x) {
//         input.push(x);
//     }

//     public void pop() {
//         peek();
//         output.pop();
//     }

//     public int peek() {
//         if (output.empty())
//             while (!input.empty())
//                 output.push(input.pop());
//         return output.peek();
//     }

//     public boolean empty() {
//         return input.empty() && output.empty();
//     }
// }

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */