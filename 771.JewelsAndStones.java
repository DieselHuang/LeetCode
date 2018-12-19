class Solution {
    public int numJewelsInStones(String J, String S) {
        int i = S.length();
        int j = J.length();
        int count =0;
        for(int k=0;k<j;k++){
            char jewel = J.charAt(k);
                for(int r=0;r<i;r++){
                    char judge = S.charAt(r);
                    if(jewel==judge){
                        count++;
                    }
                }
        }
        return count;
    }
}