class Solution {
    public boolean isValid(String s) {
        if (s.length()==0) {
            return true;
        }
        if (s.length()==1) {
            return false;
        }
        
        Stack<Character> stack = new Stack<Character>();
        for(int i=0; i<s.length(); i++) {
            char mark = s.charAt(i);
            if (mark=='(' || mark=='[' || mark=='{') {
                stack.push(mark);
            } else {
                if (stack.empty()) {
                    return false;
                }
                char pair = stack.pop();
                if (pair=='(' && mark!=')') {
                    return false;
                } else if (pair=='[' && mark!=']') {
                    return false;
                } else if (pair=='{' && mark!='}'){
                    return false;
                }
            }
        }
        return stack.empty();
    }
}