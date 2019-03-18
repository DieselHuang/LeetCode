class Solution {
    public int strStr(String haystack, String needle) {
        /*if(needle.length() == 0) {
            return 0;
        }
        if(haystack.length() == 0 || haystack.length() < needle.length()) {
            return -1;
        }
        
        int len = haystack.length() - needle.length();
        for(int i=0; i<=len; i++) {
            if(haystack.substring(i, i+needle.length()).equals(needle)) {
                return i;
            }
        }
        return -1;*/
        for(int i=0;;i++) {
            for(int j=0;;j++) { // 三个if语句的顺序不能互换！
                if(j == needle.length()) {
                    return i;
                }
                if(i + j == haystack.length()) {
                    return -1;
                }
                if(haystack.charAt(i + j) != needle.charAt(j)) {
                    break;
                }
            }
        }
    }
}