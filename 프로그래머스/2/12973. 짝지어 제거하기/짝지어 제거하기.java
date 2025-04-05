import java.util.Stack;

class Solution
{
    public int solution(String s)
    {
        int answer = -1;
        
        Stack<Character> stack = new Stack<>();
        
        for(char ch : s.toCharArray())
        {
            if(!stack.isEmpty() && stack.peek() == ch)
            {
                stack.pop();
            }
            else
            {
                stack.push(ch);
            }
        }
        
        answer = stack.isEmpty() ? 1 : 0;
        
        return answer;
    }
}