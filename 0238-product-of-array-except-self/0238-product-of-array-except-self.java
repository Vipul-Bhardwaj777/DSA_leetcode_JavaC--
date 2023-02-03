class Solution {
    public int[] productExceptSelf(int[] nums) {
       
        int n=nums.length;
        int[] ans=new int[n];
        int p=1;
        for(int i=0;i<n;i++)
            {
          p*=nums[i];
            ans[i]=p;
            }
        
        p=1;
        for(int i=n-1;i>0;i--)
            {
            ans[i]=ans[i-1]*p;
            p*=nums[i];
            }
        ans[0]=p;
        
        return ans;
    }
}