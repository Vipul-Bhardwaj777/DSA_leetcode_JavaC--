class Solution {
    public int[] sumZero(int n) {
       
        int[] ans=new int[n];
        int sum=0;
        for(int i=0;i<n;i++)
            {
            ans[i]=i;
            sum+=ans[i];
            }
        ans[0]=-sum;
        
        return ans;
    }
}