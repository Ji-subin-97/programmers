class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        char[] ca = {'a', 'e', 'i', 'o', 'u'};
        
        for(int i = 0; i < my_string.length(); i++) {
            boolean flag = false;
            char cl = my_string.charAt(i);
            
            for(char cf : ca) {
                if(cl == cf) {
                    flag = true;
                    break;
                }
            }
            
            if(!flag) sb.append(cl);
        }
        
        return sb.toString();
    }
}