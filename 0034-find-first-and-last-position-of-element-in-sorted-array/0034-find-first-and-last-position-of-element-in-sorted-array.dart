class Solution {
  List<int> searchRange(List<int> nums, int target) {
    int binarySearchLeft(List<int> nums, int target) {
      int left = 0, right = nums.length - 1;
      while (left <= right) {
        int mid = (left + right) ~/ 2;
        if (nums[mid] >= target) {
          right = mid - 1;
        } else {
          left = mid + 1;
        }
      }
      return left;
    }

    int binarySearchRight(List<int> nums, int target) {
      int left = 0, right = nums.length - 1;
      while (left <= right) {
        int mid = (left + right) ~/ 2;
        if (nums[mid] > target) {
          right = mid - 1;
        } else {
          left = mid + 1;
        }
      }
      return right;
    }

    int leftIndex = binarySearchLeft(nums, target);
    if (leftIndex == nums.length || nums[leftIndex] != target) {
      return [-1, -1];
    }
    return [leftIndex, binarySearchRight(nums, target)];
  }
}