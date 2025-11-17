class Solution {
    public String solution(String my_string, int num1, int num2) {
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < my_string.length(); i++) {
            char c = '0';
            
            if(i == num1) {
                c = my_string.charAt(num2);
            } else if(i == num2) {
                c = my_string.charAt(num1);
            } else {
                c = my_string.charAt(i);
            }
            
            sb.append(c + "");
        }
        
        return sb.toString();
    }
}