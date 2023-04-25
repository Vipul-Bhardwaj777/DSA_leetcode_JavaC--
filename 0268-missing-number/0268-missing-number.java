     /* Range from 0-n consecutive numbers so use Cyclic sort
         O(1) space complexity and O(n) time complexity is achived by Cyclic sort
        
        First check n 
            idx 0 1 2
        nums = [3,0,1] here n = 3
                                 
                            
        After using cyclic sort with an exception that ignore the index which is not present in the array
        Here 3 idx is not present 
        
        Step 1 -
        
        0 1 2   Check 3 is at idx 3, but 3 idx doesnot exist so ignore ++
       [3,0,1]
       
       [3,0,1] check 0 is at idx 0, no swap 
       
       [0,3,1] ignore 3 and check 1 is at idx 1, no so swap
       
       Step 2 -
       
        0 1 2  Now check which idx is first detected to be having wrong element (Search from the last idx)
       [0,1,3] 
       
       index 2 contains wrong element so 2 is the ans
       
       Special case -
       When the n is missing eg- [2,0,1] here n = 3 so the above algo will not find any idx with wrong element [0,1,2]
       But we know 3 is missing so just return n in such case
        
        
        */
class Solution {
    
    void swap( int[] arr, int x, int y ){
        int temp = arr[x];
        
        arr[x] = arr[y];
        
        arr[y] = temp;
        
    }
    
    public int missingNumber(int[] nums) {
        
        int i = 0;
        
        
        while(i < nums.length){
            
            int correct = nums[i];
            
            if(nums[i] < nums.length && nums[i] != nums[correct]){
                swap(nums, i, correct );
                
            }
            
            else{
                
                i++ ; // ignore if that idx doesnot exist
            } 
            
        }
        
        // Now check which idx is first detected to be having wrong element
        
        for(int idx = nums.length-1; idx >= 0; idx--){
            if( nums[idx] != idx )   return idx;     
        }
        
   
        
        
  return nums.length; // As above for loop will not detect if n is missing in special case
    }
}