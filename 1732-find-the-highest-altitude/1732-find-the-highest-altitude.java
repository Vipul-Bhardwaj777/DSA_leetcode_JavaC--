class Solution {
    public int largestAltitude(int[] gain) {
        int mx=Integer.MIN_VALUE;
        int[] ans=new int[gain.length+1];
        ans[0]=0;
        for(int i=0;i<gain.length;i++)
            {
            ans[i+1]=ans[i]+gain[i];
            
            }
        for(int i=0;i<ans.length;i++)

            {
            mx=Math.max(mx,ans[i]);
            }
            
      return mx;
    }
}