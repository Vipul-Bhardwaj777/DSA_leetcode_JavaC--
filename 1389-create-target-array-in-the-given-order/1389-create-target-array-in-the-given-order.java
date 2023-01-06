class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> v=new ArrayList<>();
        int[] ans=new int[nums.length];
        for(int i=0;i<nums.length;i++)
            {
            
           v.add(index[i],nums[i]);
            
            }
      for(int j=0;j<nums.length;j++)
          {
          ans[j]=v.get(j);
          }
        
        
        
        
        return ans;
        
    }
}