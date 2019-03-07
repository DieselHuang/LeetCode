/*
class Solution {
    public String convert(String s, int numRows) {
        String res = "";
        if(s.length() == 0) {
            return res;
        }
        if(numRows == 1) {
            return s;
        }
        
        int index;
        for(int i=0; i<numRows-1; i++) {
            index = i;
            boolean flag = false;
            while(index < s.length()) {
                res += s.charAt(index);
                if(i > 0 && flag) {
                    index += 2 * i;
                } else{
                    index += (2 * (numRows - i - 1));
                }
                flag = !flag;
            }
        }
        index = numRows - 1;
        while(index < s.length()) {
            res += s.charAt(index);
            index += (2 * (numRows - 1));
        }
        return res;
    }
}
*/

class Solution {
    public String convert(String s, int numRows) {

        if (numRows == 1) return s;

        StringBuilder ret = new StringBuilder();
        int n = s.length();
        int cycleLen = 2 * numRows - 2;

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j + i < n; j += cycleLen) {
                ret.append(s.charAt(j + i));
                if (i != 0 && i != numRows - 1 && j + cycleLen - i < n)
                    ret.append(s.charAt(j + cycleLen - i));
            }
        }
        return ret.toString();
    }
}