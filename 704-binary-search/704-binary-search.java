class Solution {
    public int search(int[] nums, int target) {
        
        // using recurnsion
        
        return bsearch( nums, target, 0 , nums.length-1);
        
    }
    
    static int bsearch( int[] nums, int target, int s, int e){
        
        if(s > e) return -1;
        
        
        int mid = s+(e-s)/2;
        
        if(nums[mid] == target) return mid;
        
        if(nums[mid] < target){
           return bsearch(nums, target, mid+1, e);           // Dont forget to return the bsearch as fn return type is int
        }
        
        else{
          return  bsearch(nums, target, s, mid-1);
        }
    }
}