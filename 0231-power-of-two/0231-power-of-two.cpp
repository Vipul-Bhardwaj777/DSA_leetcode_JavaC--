class Solution {
public:
    bool isPowerOfTwo(int n) {
        
        if(n==1)return true;
        if(n==0)return false;
      
        return( n > 0 && (n & n-1) == 0 ); 
        // power of 2 consists of 1 setbit and all 00's eg 1000 = 111 + 1 where 111 = n-1 and if we and it we'll get 0 if it's a pow of 2
        
        
        
    }
};