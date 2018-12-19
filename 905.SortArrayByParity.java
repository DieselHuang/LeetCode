class Solution {

public int[] sortArrayByParity(int[] A) {

    int[] result = new int[A.length];
    int startingPoint = 0;
    int endingPoint = result.length-1;
    for(int i=0;i<A.length;i++){
        if(A[i]%2 == 0){
           result[startingPoint] = A[i];
            startingPoint++;
        }else{
            result[endingPoint] = A[i];
            endingPoint--;
        }
    }      
	
    return result;
}
}