/*
  Range is 1-n so again Cyclic sort and given to solve in linear O(n) time complexity
  After applying cyclic sort the repeating number always comes at the last index
  
*/
class Solution {
    public int findDuplicate(int[] nums) {
        
        int i = 0, n = nums.length;
        while(i < n){
            int correctidx = nums[i]-1;
            
            if(nums[correctidx] != nums[i] ){
                swap(nums, i, correctidx);
            }
            
            else{ i++; }
            
            
        }
        
        return nums[n-1];
        
    }
    
    void swap(int[] arr, int x, int y){
        
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}