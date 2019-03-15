class Solution {
    public int removeDuplicates(int[] nums) {
        /*if(nums.length < 2) {
            return nums.length;
        }
        int len = 1;
        int index = 0;
        boolean flag = true;
        for(int i=1; i<nums.length; i++) {
            if(nums[i] != nums[i-1]) {
                len++;
                if(!flag){
                    nums[index] = nums[i];
                    index++;
                }
            } else {
                if(flag) {
                    index = i;
                    flag = false;
                }
            }
        }
        return len;*/
        int i = 0;
        for(int n: nums) {
            if(i == 0 || n > nums[i - 1]) {
                nums[i++] = n;
            }
        }
        return i;
    }
}