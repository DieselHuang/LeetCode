class Solution {
    public int reverse(int x) {
        int res = 0;
        int flag = x<0? -1: 1;
        x = Math.abs(x);
        while (x % 10 != 0 || x / 10 != 0) {
            int newres = res  * 10 + x % 10;
            if (newres/10 != res) {
                return 0;
            }
            res = newres;
            x /= 10;
        }
        return res * flag;
    }
}