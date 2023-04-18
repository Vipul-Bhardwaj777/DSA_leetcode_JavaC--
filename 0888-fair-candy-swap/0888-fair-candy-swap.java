class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        
        // O(n^2)
        
        int sa=0, sb=0;
        
        int[] ans = new int[2];
        
        // Find sum of both the arrays
        for(int i: aliceSizes){
            sa+=i;
        }
       
         for(int i: bobSizes){
            sb+=i;
        }
        
        
        for(int i = aliceSizes.length-1; i>=0; i--){
            for(int j= bobSizes.length-1 ; j>=0; j--){
                
                // sa - diff = sb + diff means it's a fair candy swap
                
                int diff = aliceSizes[i] - bobSizes[j]; 
                
                if(sa - diff == sb + diff){
                    ans[0] = aliceSizes[i];
                    ans[1] = bobSizes[j];
                    return ans;
                }
            }
        }
        
        return new int[] {};
    }
}