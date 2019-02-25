class Solution {
    public List<String> letterCombinations(String digits) {
        LinkedList<String> res = new LinkedList<String>();
        if (digits.isEmpty()) {
            return res;
        }
        res.add("");
        String mapping[] = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        for(int i=0; i<digits.length(); i++) {
            int x = digits.charAt(i) - '0';
            while (res.peek().length() == i) {
                String t = res.remove();
                for(char s: mapping[x].toCharArray()) {
                    res.add(t + s);
                }
            }
        }
        return res;
    }
}