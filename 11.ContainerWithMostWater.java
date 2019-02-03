/*class Solution {
    public int maxArea(int[] height) {
        int res = 0;
        for(int i=0; i<height.length-1; i++) {
            for(int j=i+1; j<height.length; j++) {
                int area = Math.min(height[i], height[j]) * (j -i);
                res = Math.max(res, area);
            }
        }
        return res;
    }
}*/

class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int res = 0;
        while(left < right) {
            res = Math.max(res, Math.min(height[left], height[right]) * (right - left));
            if(height[left] < height[right]) {
                left++;
            }else {
                right--;
            }
        }
        return res;
    }
}