class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<String>();
        backtrack(res, "", n, n);
        return res;
    }
    
    private void backtrack(List<String> res, String s, int left, int right) {
        if(left==0 && right==0) {
            res.add(s);
            return;
        }
        if(left > 0) {
            backtrack(res, s+"(", left-1, right);
        }
        if(left < right) {
            backtrack(res, s+")", left, right-1);
        }
    }
}