class Solution {
    static String trans(String word){
        String[] trans = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String result = "";
        for(int i=0;i<word.length();i++){
            result += trans[(int)word.charAt(i) - 97];
        }
        return result;
    }
    
    public int uniqueMorseRepresentations(String[] words) {
        Set<String> unique = new HashSet<>();
        for(String word:words){
           unique.add(trans(word));
        }
        return unique.size();
    }
}