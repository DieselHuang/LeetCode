class Solution {
    public boolean judgeCircle(String moves) {
        int numLorR = 0;
        int numUorD = 0;
        for (int i=0;i<moves.length();i++) {
            if (moves.charAt(i) == 'L'){
                numLorR--;
                continue;
            }
            if (moves.charAt(i) == 'R'){
                numLorR++;
                continue;
            }
            if (moves.charAt(i) == 'U'){
                numUorD++;
                continue;
            }
            if (moves.charAt(i) == 'D'){
                numUorD--;
                continue;
            }
        }
        if (numLorR == 0 && numUorD == 0){
            return true;
        }else{
            return false;
        }
    }
}