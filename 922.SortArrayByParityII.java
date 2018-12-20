class Solution {
    public int[] sortArrayByParityII(int[] A) {
        boolean flag[] = new boolean[A.length]; 
        for (int i=0; i<A.length; i++) {
            flag[i] = (i%2==0&&A[i]%2==0)||(i%2!=0&&A[i]%2!=0)? true: false;
        }
        for (int i=0; i<A.length-1; i++) {
            if (flag[i]) {
                continue;
            } else {
                for (int j = i+1; j<A.length; j+=2) {
                    if (!flag[j]) {
                        int temp = A[j];
                        A[j] = A[i];
                        A[i] = temp;
                        flag[j] = true;
                        break;
                    }
                }
            }
        }
        return A;
    }
}

/* inspiring answer

class Solution {
    public int[] sortArrayByParityII(int[] A) {
        int i = 0, j = 1, n = A.length;
        while (i < n && j < n) {
            while (i < n && A[i] % 2 == 0) {
                i += 2;
            }
            while (j < n && A[j] % 2 == 1) {
                j += 2;
            }
            if (i < n && j < n) {
                swap(A, i, j);
            }
        }
        return A;
    }
    private void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
}
*/