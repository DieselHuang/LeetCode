class Solution {
    public int[] searchRange(int[] nums, int target) {
        if(nums.length == 0 || target < nums[0] || target > nums[nums.length - 1]) {
            return new int[] {-1, -1};
        }
        
        int[] res = new int[2];
        res[0] = findLeft(nums, target);
        res[1] = findRight(nums, target);
        return res;
    }
    
    private int findLeft(int[] nums, int target) {
        int idx = -1;
        int lo = 0;
        int hi = nums.length - 1;
        while(lo <= hi) {
            int mid = (lo + hi) / 2;
            if(nums[mid] >= target) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
            if(nums[mid] == target) {
                idx = mid;
            }
        }
        return idx;
    }
    
    private int findRight(int[] nums, int target) {
        int idx = -1;
        int lo = 0;
        int hi = nums.length - 1;
        while(lo <= hi) {
            int mid = (lo + hi) / 2;
            if(nums[mid] <= target) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
            if(nums[mid] == target) {
                idx = mid;
            }
        }
        return idx;
    }
}