class Solution {
    public int singleNumber(int[] nums) {
        
        // We know that XOR of any no with itself = 0 i.e x ^ x = 0 , so we xor all nos and the duplicates will be 0 and we will get our ans 
        
        int ans = 0;
        
        for(int x : nums){
            
            ans ^= x;               // 0 ^ x = x    and then next iterations
        }
        
        return ans;
        
    }
}