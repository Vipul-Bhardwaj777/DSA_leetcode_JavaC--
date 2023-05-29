class Solution {
public:
    int hammingWeight(uint32_t n) {
        
        int c=0;
        
        while(n > 0)                   // Running with O(logn) T.C as running no of bits times
            {
            
             if(n & 1 == 1) c++;       // find LSP and c++ if its a setbit
            
              n >>= 1;                 // move to next bit
           
            }
        return c;
        
    }
};