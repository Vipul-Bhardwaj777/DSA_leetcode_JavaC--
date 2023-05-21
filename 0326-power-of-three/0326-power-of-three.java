class Solution {
    public boolean isPowerOfThree(int n) {
        
        if(n == 0) return false;
        if(n == 1) return true;
        
        while(n % 3 == 0){         // if is completely divisible by 3 keep on dividing by 3
            n /= 3;
        }
        
        return n == 1;            // if at the end n becomesd 1 it's a pow of 3
    }
}