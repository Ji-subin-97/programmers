class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        String ls = s.toLowerCase();
        
        int p = 0;
        int y = 0;
        
        for(int i = 0 ; i < ls.length(); i++)
        {
            char ch = ls.charAt(i);
            if(ch == 'p') p++;
            else if(ch == 'y') y++;
        }
        
        if(p != y) answer = false;
        
        return answer;
    }
}