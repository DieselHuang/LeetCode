/*
    class Solution {
    private boolean isPd(char[] arr, int i, int j) {
        if (i<0 || i==j) {
            return false;
        } 
        
        while (i<j) {
            if (arr[i++]!=arr[j--]) {
                return false;
            }
        }
        
        return true;
    }
    
    public String longestPalindrome(String s) {
        if (s.length() < 2) {
            return s;
        }
        
        char[] arr = s.toCharArray();
        int lo = 0, hi = 0;
        int max = 1;
        for (int i=0; i<arr.length; i++) {
            if (isPd(arr, i-max-1, i)) {
                lo = i - max - 1;
                hi = i;
                max += 2;
            } else if (isPd(arr, i-max, i)) {
                lo = i - max;
                hi = i;
                max += 1;
            }
        }
        return s.substring(lo,hi+1);
    }
}
*/

class Solution {
    private int lo, max = 1;
    
    private void centralDiffusion(String s, int i, int j) {
        while (i>=0 && j<s.length() && s.charAt(i) == s.charAt(j)) {
            i--;
            j++;
        }
        
        if (max < j-i-1) {
            max = j - i - 1;
            lo = i + 1;
        }
    }
    
    public String longestPalindrome(String s) {
        if (s.length() < 2) {
            return s;
        }
        
        for (int i=0; i<s.length()-1; i++) {
            centralDiffusion(s, i, i); //odd length
            centralDiffusion(s, i, i+1); //even length
        }
        
        return s.substring(lo, lo+max);
    }
}
