class Solution {
    public int divide(int dividend, int divisor) {
        boolean neg = false;
        if((dividend<0 && divisor>0) || (dividend>0 && divisor<0)) {
            neg = true;
        }
        long dvd = Math.abs((long)dividend);
        long dvs = Math.abs((long)divisor);
        
        if(dvd == 0 || dvd < dvs) {
            return 0;
        }
        
        long ans = helper(dvd, dvs);
        if(ans > Integer.MAX_VALUE) {
            return neg? Integer.MIN_VALUE: Integer.MAX_VALUE;
        } else {
            return neg? -(int)ans: (int)ans;
        }
    }
    
    private long helper(long dvd, long dvs) {
        if(dvd < dvs) {
            return 0;
        }
        
        long sum = dvs;
        long mtp = 1;
        while((sum + sum) <= dvd) {
            sum += sum;
            mtp += mtp;
        }
        return mtp + helper(dvd - sum, dvs);
    }
}