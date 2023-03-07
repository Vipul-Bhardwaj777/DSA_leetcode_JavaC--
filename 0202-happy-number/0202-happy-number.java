class Solution {
    public boolean isHappy(int n) {
        
        // It acts like a cyclic linked list where the squares will eventually repeat
        
        int slow = n;
        int fast = n;
        
        do{
            slow = sq(slow);
            fast = sq(sq(fast));
        }while(slow != fast);
        
        if(slow == 1) return true;
        

           
      return false;
        
       
         
        
    }
    
    int sq( int num){
            
            int ans = 0;
            
            while(num > 0){
                
                int rem = num % 10;
                ans += rem * rem;
                
                num /= 10;
            }
            
           return ans; 
        }
        
}