class Solution {
    public String toLowerCase(String str) {
        String lowerCase = "";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)<=90 && str.charAt(i)>=65){
                lowerCase += (char)(str.charAt(i)+32);
            }else{
                lowerCase += str.charAt(i);
            }   
        }
        return lowerCase;
    }
}