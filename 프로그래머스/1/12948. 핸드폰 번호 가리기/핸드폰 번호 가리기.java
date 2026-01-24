class Solution {
    public String solution(String phone_number) {
        String answer = "";
        int index = phone_number.length();
        
        answer = phone_number.substring(0, index - 4).replaceAll("[0-9]", "*") + phone_number.substring(index - 4, index); 
        
        return answer;
    }
}