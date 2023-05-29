public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        
        int ans = 0;                    // 0000------0 32 0's
        
        for(int i = 0; i < 32; i++){    // iterate each 0
            
              ans <<= 1;                // create a space for adding the bit first
            
            if((n & 1) == 1) ans++;     // find the LSP and add if its 1 and  do nothing if it's 0 
            
          
            
            n >>= 1;                    // right shift n to check the next bit which will be added in the next iteration
        }
        
        return ans;
    }
}