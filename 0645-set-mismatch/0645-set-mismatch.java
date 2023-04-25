/*
Here the range is from 1-n apply cyclic sort 
After applying cyc sort, run a for loop and check which element is at wrong idx, the duplicate will  always be at the last idx and then return the duplicate and the missing no which is i+1  
*/
class Solution {
    public int[] findErrorNums(int[] nums) {
        
        int i = 0, n = nums.length;
        
        while(i < n){
        
            int correctidx = nums[i]-1;
            
            if(nums[correctidx] != nums[i]){

            swap(nums, i, correctidx);
            
            }
            
            else{
                i++;
            }
        }
        
        
        
        for(int j = n-1; j >= 0; j-- ){

        if(nums[j] != j+1){
            
          return new int[] {nums[j],j+1} ;
        }
            
            }
        
        return new int[] {-1,-1};
        
    }
    
     void swap(int[] arr, int x, int y){

        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}