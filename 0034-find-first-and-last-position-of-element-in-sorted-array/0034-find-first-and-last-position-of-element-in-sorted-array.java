class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res={-1,-1};
        
        res[0]=search(nums,target,true);
 
       res[1]=search(nums,target,false);
   
        return res;
        
    }
    
    
  int search(int[] nums,int target,boolean fo)
      {
    int n=nums.length;
        int ans=-1;
        int s=0,e=n-1;
        while(s<=e)
            {
            int mid=s+((e-s)/2);
            
            if(target<nums[mid])e=mid-1;
   
            else if(target>nums[mid])
                {
                s=mid+1;
                
                }
            else{
                ans=mid;
                if(fo) e=mid-1;
                
                else{s=mid+1;}
            }
            
                
          }
      return ans;
            
      
        
        
      }  
}