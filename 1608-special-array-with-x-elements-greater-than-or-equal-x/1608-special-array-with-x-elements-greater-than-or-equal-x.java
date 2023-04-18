class Solution {
    public int specialArray(int[] nums) {
        
        
        
      if (nums.length == 1 && nums[0] > 0) {
            return 1;
        }
        int start = 0, end = nums.length;
        while (start <= end) {
            int mid = (start + end) / 2;
            int countG = 0;
            //count how many elements are greater or equal to the current element
            for (int i : nums) {
                if (i >= mid) {
                    countG++;
                }
            }
            if (countG > mid) {
                start = mid + 1;
            } else if (countG < mid) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
        
    }
