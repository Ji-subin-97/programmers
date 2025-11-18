class Solution {
    public String solution(int age) {
        String str = "abcdefghij";
        String answer = String.valueOf(age);
        StringBuilder sb = new StringBuilder();
        
        for(char c : answer.toCharArray()) {
            sb.append(str.charAt(c - '0'));
        }
        
        return sb.toString();
    }
}