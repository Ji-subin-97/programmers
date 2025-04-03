import java.util.*;

class Solution {
    boolean solution(String s) {
        Stack<Character> st = new Stack<>();
        
        for(int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            if(ch == '(')
            {
                st.push(ch);
            }
            else if(ch == ')')
            {
                if(st.isEmpty()) return false;
                st.pop();
            }
        }
        
        return st.isEmpty();
    }
}