class Solution {
    public int repeatedNTimes(int[] A) {
        Arrays.sort(A);
        int i = 0;
        for (; i<A.length/2; i++) {
            if (A[i] == A[i+1]) {
                break;
            }
        }
        return A[i];
    }
}

/*answer1
class Solution {
    public int repeatedNTimes(int[] A) {
        Set<Integer> set = new HashSet<>();
        int num = 0;
        for (int i : A) {
            if (set.contains(i)) {
                num = i;
                break;
            }
            set.add(i);
        }
        return num;
    }
}
*/

/*answer2
 public int repeatedNTimes(int[] A) {
        int[] count = new int[10000];
        for (int a : A)
            if (count[a]++ == 1)
                return a;
        return -1;
    }
*/
