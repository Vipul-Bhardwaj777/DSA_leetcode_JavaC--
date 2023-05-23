class Solution {
    
    static int bits(int a){               // fn for counting bits
          
        int c = 0;
        
        while(a > 0){
           
            if((a & 1) == 1) c++;         // if LSP is 1 c++  
            
            a >>= 1;                      // move to next bit
        }
        
        return c;
}
    public int[] countBits(int n) {
        
        int[] ans = new int[n+1];
        
        for(int i = 0; i <= n; i++){
            
            ans[i] = bits(i);
        }
        
        return ans;
    }
}