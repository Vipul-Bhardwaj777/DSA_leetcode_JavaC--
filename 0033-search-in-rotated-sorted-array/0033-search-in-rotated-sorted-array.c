int search(int* nums, int numsSize, int target) {
    int pivot = findPivot(nums, 0, numsSize-1);
    if (pivot == -1) 
        return binarySearch(nums, 0, numsSize-1, target);
    if (nums[pivot] == target) 
        return pivot;
    if (nums[0] <= target) 
        return binarySearch(nums, 0, pivot-1, target);
    return binarySearch(nums, pivot+1, numsSize-1, target);
}

int findPivot(int* nums, int low, int high) {
    if (high < low) 
        return -1;
    if (high == low) 
        return low;
    int mid = (low + high)/2;
    if (mid < high && nums[mid] > nums[mid + 1])
        return mid;
    if (mid > low && nums[mid] < nums[mid - 1])
        return (mid-1);
    if (nums[low] >= nums[mid])
        return findPivot(nums, low, mid-1);
    return findPivot(nums, mid + 1, high);
}

int binarySearch(int* nums, int low, int high, int target) {
    if (high < low)
        return -1;
    int mid = (low + high)/2;
    if (target == nums[mid])
        return mid;
    if (target > nums[mid])
        return binarySearch(nums, (mid + 1), high, target);
    return binarySearch(nums, low, (mid -1), target);
}