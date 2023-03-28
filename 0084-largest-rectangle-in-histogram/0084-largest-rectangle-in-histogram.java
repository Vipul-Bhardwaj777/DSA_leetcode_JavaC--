class Solution {
    public int largestRectangleArea(int[] heights) {
        
        int maxarea = 0;
        
        int[] ns = nextsmaller(heights);                     // (nextsmaller - prevsmaller - 1) gives the range upto which                                                                   we can make rectangle horizontally
                                                                
        int[] ps = prevsmaller(heights);
        
        for(int i = 0; i < heights.length; i++){               // checking area for each bar and finding max
            
            int currarea = (ns[i] - ps[i] - 1) * heights[i];
            
            maxarea = Math.max(maxarea, currarea);
        }
        
        return maxarea;                                        // max is found
    }
    
    
    int[] prevsmaller(int[] arr){                             // Finding prevsmaller idx for each element to heights and                                                                  storing it in an array
        
        int[] ps = new int[arr.length];
        Stack<Integer> s = new Stack<>();
        
         
        for(int i = 0; i < arr.length; i++){

       while(!s.isEmpty() && arr[s.peek()] >= arr[i]){       // If the top element of stack is greater than the arr[i]                                                                    pop it and keep popping until the stack is empty or                                                                      smaller element is found
           s.pop();
       } 
            
            if(s.isEmpty()) ps[i] = -1;                     // if stack is empty means no prevsmaller so put -1
            
            else{
                ps[i] = s.peek();                            // prevsmaller element found 
            }
            
            s.push(i);                                       // Keep pushing all elements in stack after iteration
        
        }
        
        return ps;
        
    }
    
    
    
    
     int[] nextsmaller(int[] arr){
        
          int[] ns = new int[arr.length];
        Stack<Integer> s = new Stack<>();
        
         
        for(int i = arr.length-1; i >= 0 ; i--){               // Just start from last and fill ns[] also from last

       while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
           s.pop();
       } 
            
            if(s.isEmpty()) ns[i] = arr.length;
            
            else{
                ns[i] = s.peek();                              // Nextsmaller found
            }
            
            s.push(i);
        
        }
        
        return ns;
        
    }
    
    
}