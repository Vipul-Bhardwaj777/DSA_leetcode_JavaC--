/*
   Range 1-n so correct idx will  be nums[i]-1 and use cyclic sort and also (without extra space and in O(n) runtime? You may assume the returned list does not count as extra space.)
      
   Here are some duplicate elements, but they are automatically handled if(nums[correct] == nums[i]) { i++; } 
   
   
   
   
*/

class Solution {
    void swap(int[] arr, int x, int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
    
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i =0, n = nums.length;
        
        ArrayList<Integer> list = new ArrayList<>();
        
        while(i < n){
            int correct = nums[i]-1;
            
            if(nums[correct] != nums[i]){
                swap(nums, i, correct);
            }
            
            else{
                i++;
            }
        }
        
        for(int idx = 0; idx < n ; idx++ ){
             if( nums[idx] != idx + 1 ) list.add(idx + 1);
        }
        
        return list ;
    }
}