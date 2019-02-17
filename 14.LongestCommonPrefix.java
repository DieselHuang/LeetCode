/*
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0 || strs[0] == "") {
            return "";
        }
        if (strs.length == 1) {
            return strs[0];
        }
        
        if (strs[0].length() == 1) {
           for (String s: strs) {
                if (s.indexOf(strs[0]) != 0) {
                    return "";
                }
            }
            return strs[0];
        }
        
        String res = "";
        for (int i=1; i<strs[0].length(); i++) {
            String trial = strs[0].substring(0, i);
            for (String s: strs) {
                if (s.indexOf(trial) != 0) {
                    return res;
                }
            }
            res = trial;
        }
        for (String s: strs) {
            if (s.indexOf(strs[0]) != 0) {
                return res;
            }
        }
        return strs[0];
    }
}
*/

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        
        String pre = strs[0];
        int i = 1;
        while (i < strs.length){
            while (strs[i].indexOf(pre) != 0) {
               pre = pre.substring(0,pre.length()-1);
 
            }
                i++;
        }
        return pre;
    }
}