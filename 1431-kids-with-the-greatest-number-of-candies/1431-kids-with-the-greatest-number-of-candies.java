class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int mx=Integer.MIN_VALUE;
        List<Boolean> ans=new ArrayList<>();
        
        for(int i=0;i<candies.length;i++)
            {
            mx=Math.max(mx,candies[i]);
            }
        
      for(int i=0;i<candies.length;i++)
          {
          if(candies[i]+extraCandies>=mx)
              { ans.add(true);}
          
          else{ ans.add(false);}
          
          }
          
        return ans;
        
            
    }
}