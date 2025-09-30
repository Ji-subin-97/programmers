class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        int n = my_string.length();
        
        if(n > is_prefix.length()) n = is_prefix.length();
        
        if(is_prefix.equals(my_string.substring(0, n))) answer = 1;
        
        return answer;
    }
}