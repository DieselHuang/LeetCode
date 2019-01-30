class Solution {
    public int myAtoi(String str) {
        str = str.trim();
        
        if (str.length()==0 || str.charAt(0)>'9' || (str.charAt(0)<'0' && str.charAt(0)!='+' && str.charAt(0)!='-')) {
            return 0;
        }
        
        int index;
        int res = 0;
        int i = 0;
        int sign = 1;
        if (str.charAt(i)=='+' || str.charAt(i)=='-') {
            if (str.length()<2) {
                return 0;
            }
            
            if (str.charAt(i)=='-') {
                sign = -1;
            }
            i++;
        }
        for (; i<str.length(); i++) {
            index = str.charAt(i) - '0';
            if (index>9 || index<0) {
                break;
            }
            if(res > Integer.MAX_VALUE/10 || (res == Integer.MAX_VALUE/10 && index > Integer.MAX_VALUE%10)) {
                return sign==-1? Integer.MIN_VALUE: Integer.MAX_VALUE;
            } else {
                res = res * 10 + index;
            }
        }
        return res *= sign;
    }
}