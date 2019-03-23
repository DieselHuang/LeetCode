class Solution {
    public int search(int[] nums, int target) {
        int lo = 0;
        int hi = nums.length - 1;
        while(lo <= hi) {
            int mid = (lo + hi) / 2;
            if (target == nums[mid]) {
                return mid;
            }
            if (target == nums[lo]) {
                return lo;
            }
            if (target == nums[hi]) {
                return hi;
            }
            if ((target > nums[mid] && nums[mid] > nums[lo]) ||
               (nums[lo] > target && target > nums[mid]) ||
               (nums[mid] > nums[lo] && nums[lo] > target)) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return -1;
    }
}