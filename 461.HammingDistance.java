class Solution {
    public int hammingDistance(int x, int y) {
        // XORing results in 1's where there are differences, 
        // and 0's on matched bits
        int c = x ^ y;
        
        // This will contain the number of bits which matched
        int count = 0;
        
        // Stop when all bits in c are 0, indicating no matches remaining to count
        // Shifting always pulls in a 0 on the most significant bit, 
        // so we are always getting closer to c = 0
        while(c != 0) {
            // By bit masking with 1, we are able to check the least
            // significant bit is a 1. If it is, c & 1 = 1.
            // Otherwise, c&1 = 0.
            count += c & 1;
            
            // Shift the bits to the right
            // Brings in a 0 on the far left
            c = c >> 1;
        }
        
        // Return the number of matched bits
        return count;
    }
}