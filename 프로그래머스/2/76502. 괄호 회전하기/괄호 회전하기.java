import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        int slen = s.length();
        
        String[] sArr = new String[slen];
        Stack<Character> st = new Stack<>();
        
        for(int i = 0; i < slen; i++)
        {
            if(i >= 1)
            {
               s = s.substring(1) + s.charAt(0);
            }
            sArr[i] = s;
        }
        
        
        for(int i = 0; i < sArr.length; i++)
        {
            boolean isCorrect = true;
            
            for(int j = 0; j < sArr[i].length(); j++)
            {
                char ch = sArr[i].charAt(j);
                
                if(ch == '(' || ch == '{' || ch == '[')
                {
                    st.push(ch);
                }
                else
                {
                    if(st.isEmpty() || !isMatching(st.pop(), ch))
                    {
                        isCorrect = false;
                        break;
                    }
                  
                }
            }
            
            if(isCorrect && st.isEmpty())
            {
                answer++;
            }
            
            st.clear();
        }
        
        return answer;
    }
    
    public boolean isMatching(char open, char close)
    {
        return (open == '(' && close == ')') ||
               (open == '{' && close == '}') ||
               (open == '[' && close == ']');
    }
    
}