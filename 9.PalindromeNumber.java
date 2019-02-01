/*class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) {
            return false;
        }
        
        if(x / 10 == 0) {
            return true;
        }
        
        String str = "" + x;
        int l = str.length();
        boolean res = true;
        for(int i=0; i<l/2; i++) {
            if(str.charAt(i) != str.charAt(l-1-i)) {
                res = false;
            }
        }
        return res;
    }
}*/

class Solution {
    public boolean isPalindrome(int x) {
       if(x<0 || (x!=0 && x%10==0)) {
            return false;
        }
        
        if(x < 10) {
            return true;
        } 
        
        int rev = 0;
        while(x > rev) {
            rev = rev * 10 + x % 10;
            x /= 10;
        }
        
        return x==rev || x==rev/10;
    }
}