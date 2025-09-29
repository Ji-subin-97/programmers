class Solution {
    public String solution(String myString) {
        StringBuilder sb = new StringBuilder();
        
        for(char c : myString.toCharArray()) {
            
            if(c >= 97 && c <= 122) {
                c -= 32;
            }
            
            sb.append(c);
        }
        
        
        return sb.toString();
    }
}