class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        char[] ca = my_string.toCharArray();
        
        for(char c : ca) {
            if(sb.indexOf(c + "") == -1) sb.append(c + "");
        }
        
        return sb.toString();
    }
}