class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new LinkedList<>();
        if(nums.length < 4) {
            return res;
        }
        if(nums.length == 4) {
            if(nums[0] + nums[1] + nums[2] + nums[3] == target) {
                res.add(Arrays.asList(nums[0], nums[1], nums[2], nums[3]));
            }
            return res;
        }
        
        Arrays.sort(nums);
        for(int i=0; i<nums.length-3; i++) {
            if(nums[i]>0 && nums[i]>=target) {
                break;
            }
            if(i==0 || nums[i-1]!=nums[i]) {
                for(int j=i+1; j<nums.length-2;j++) {
                    if(nums[i]+nums[j]>0 && nums[i]+nums[j]>=target) {
                        break;
                    }
                    if(j==i+1 || nums[j-1] != nums[j]) {
                        int sum = target - nums[i] - nums[j];
                        int m = j + 1;
                        int n = nums.length - 1;
                        while(m < n) {
                            if(sum == nums[m] + nums[n]) {
                                res.add(Arrays.asList(nums[i], nums[j], nums[m], nums[n]));
                                while(m<n && nums[n]==nums[n-1]) {
                                    n--;
                                }
                                while(m<n && nums[m]==nums[m+1]) {
                                    m++;
                                }
                                n--;
                                m++;
                            } else if(sum < nums[m] + nums[n]) {
                                n--;
                            } else {
                                m++;
                            }
                        }
                    }
                }
            }
        }
        return res;
    }
}