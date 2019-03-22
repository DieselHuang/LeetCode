class Solution {
    public void nextPermutation(int[] nums) {
        int len = nums.length;
        if(len > 1) {
            int index = len - 1;
            while(index > 0) {
                if(nums[index] > nums[index - 1]) {
                    break;
                }
                index--;
            }
            if(index > 1 || (index == 1 && nums[0] < nums[1])){
                for(int i=len-1; i>=index; i--) {
                    if(nums[i] > nums[index - 1]) {
                        swap(nums, i, index - 1);
                        break;
                    }
                }
                reverse(nums, index, len - 1);
            } else {
                reverse(nums, 0, len - 1);
            }
        }
    }
    
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
    private void reverse(int[] nums, int lo, int hi) {
        while(lo < hi) {
            swap(nums, lo, hi);
            lo++;
            hi--;
        }
    }
}