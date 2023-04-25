/*
  Range is 1-n so again Cyclic sort and given to solve in linear O(n) time complexity
  
  Just one additional case when we find that the nums[i] is at correct index, it may be the case that we are on a duplicate number, so we check if its duplicate then its i+1 != nums[i]
  And if its not duplicate, simply i++
  
*/
class Solution {
    public int findDuplicate(int[] nums) {
        
        int i = 0, n = nums.length;
        
        while(i < n){
            int correctidx = nums[i]-1;
            
            if(nums[correctidx] != nums[i] ){
                swap(nums, i, correctidx);
            }
            
            else if(nums[correctidx] == nums[i] && i+1 != nums[i]){  // If we are at a duplicate no 
                
                return nums[i];
            }
            
            else{  // If we are not at a duplicate number

            i++;
            }
            
            
        }
        
        
      return -1;  
    }
    
    void swap(int[] arr, int x, int y){
        
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}