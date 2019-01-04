/*
class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) {
            return 0;
        }
        
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int res = 0;
        for (int i=0, j=0; i<s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                j = Math.max(j, map.get(s.charAt(i))+1); //'abba'的情况下，i=3时，保证j能正常保持2而不是变成1。
            }
            
            map.put(s.charAt(i), i);
            res = Math.max(res, i-j+1);
        }
        return res;
    }
}
*/

class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) {
            return 0;
        }
        
        int[] arr = new int[256];
        int res = 0;
        
        for (int i=0, j=0; i<s.length(); i++) {
            j = arr[s.charAt(i)]>0? Math.max(j, arr[s.charAt(i)]): j;
            arr[s.charAt(i)] = i+1;
            res = Math.max(res, i-j+1);
        }
        return res;
    }
}