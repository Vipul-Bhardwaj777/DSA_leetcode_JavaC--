class Solution {
    public int[] shuffle(int[] nums, int n) {
        
        int f=0,s=n,i=0;
        int[] ans= new int[2*n];
        
        
        while(f<n && s<2*n){
            
            ans[i]= nums[f];
            i++;
            f++;
            
            ans[i]= nums[s];
            i++;
            s++;
            
        }
        
        return ans;
    
    
    
    
    
    
    
    }
    
}