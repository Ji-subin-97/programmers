class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        
        for(char c : my_string.toCharArray()) {
            if(c >= 'A' && c <= 'Z') c += 32;
            else c-=32;
            
            sb.append(c + "");
        }
        
        return sb.toString();
    }
}