class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        for (int i=0;i<A.length;i++) {
            if (A[i].length%2==0) {
                for (int j=0;j<A[i].length/2;j++){
                    int temp = A[i][j]^1;
                    A[i][j] = A[i][A[i].length-1-j]^1;
                    A[i][A[i].length-1-j] = temp;
                }
            }else{
                for (int j=0;j<(int)(A[i].length/2);j++){
                    int temp = A[i][j]^1;
                    A[i][j] = A[i][A[i].length-1-j]^1;
                    A[i][A[i].length-1-j] = temp;
                }
                A[i][(int)(A[i].length/2)] ^=1;
            }
        }
        return A;
    }
}