class Solution {
    public int[] diStringMatch(String S) {
        int i = 0;
        int j = S.length();
        int arr[] = new int[j+1];
        for (int k=0; k<S.length(); k++) {
            arr[k] = S.charAt(k) == 'I'? i++: j--;
        }
        arr[S.length()] = i++;
        return arr;
    }
}