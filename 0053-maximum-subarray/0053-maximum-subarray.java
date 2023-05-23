class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0,mx=Integer.MIN_VALUE;
        
        if(nums.length==1)return nums[0];
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            
            mx=Math.max(mx,sum);
            
            if(sum<0)sum=0;
            
            
            
            
        }
        return mx;
        
        
        
        
        
        
        
    }
}