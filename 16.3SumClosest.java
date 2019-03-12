import java.lang.Math;
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int res = nums[0] + nums[1] + nums[nums.length - 1];
        int min = Math.abs(res - target);
        for(int i=0; i<nums.length-2; i++) {
            int sum = target - nums[i];
            int lo = i + 1;
            int hi = nums.length - 1;
            while(lo < hi) {
                if(sum == nums[lo] + nums[hi]) {
                    return target;
                } else {
                    if(Math.abs(sum-nums[lo]-nums[hi]) < min) {
                        res = nums[i] + nums[lo] + nums[hi];
                        min = Math.abs(res - target);
                    }
                }
                if(sum>nums[lo]+nums[hi]) {
                    lo++;
                } else {
                    hi--;
                }
            }
        }
        return res;
    }
}