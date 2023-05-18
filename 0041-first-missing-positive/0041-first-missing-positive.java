/*
O(n) time and uses constant extra space so there's just a little hint of cyclic sort

Ignore all the -ve
Here it is given find smallest +ve missing integer so smallest is 1 so keep checking from 1 that it exists or not then check 2,3,4 and so on ---- That's why cyclic sort as we are checking from 1---n
The one which is not at the correct idx after cyc sort is the missing +ve no
*/



class Solution {
    
    void swap( int[] arr, int x, int y ){
        int temp = arr[x];
        
        arr[x] = arr[y];
        
        arr[y] = temp;
        
    }
    
    public int firstMissingPositive(int[] nums) {
        
        int i = 0;
        
        
        while(i < nums.length){
            
            int correct = nums[i]-1;
            
            if( nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[correct]){
                swap(nums, i, correct );
                
            }
            
            else{
                
                i++ ; // ignore if that idx doesnot exist or it is -ve or is greater than n
            } 
            
        }
        
        // Now check which idx is first detected to be having wrong element
        
        for(int idx = 0; idx < nums.length; idx++){
            if( nums[idx] != idx+1 )   return idx+1;     
        }
        
   
        
        
  return nums.length+1; 
    }
}