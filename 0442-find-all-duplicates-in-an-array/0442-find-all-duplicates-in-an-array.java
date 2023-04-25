/*
 Range is from 1-n so Cyclic sort 
 After applying cyc sort the ans will the ones which are left at the wrong idx so run a for loop and find which are left at wrong idx and add them to the list
*/
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        
                int i = 0, n = nums.length;
        
        while(i < n){
            int correctidx = nums[i]-1;

            if(nums[correctidx] != nums[i] ){
                swap(nums, i, correctidx);
            }

            else{ i++; }


        }
        
        List<Integer> list = new ArrayList<>();

      for(int j = n-1; j >= 0; j--){

      if(nums[j] != j+1){
          
         list.add(nums[j]);
      }
      }
        
        return list;

    
    }

    void swap(int[] arr, int x, int y){

        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}
