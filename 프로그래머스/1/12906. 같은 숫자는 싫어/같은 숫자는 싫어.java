import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> st = new Stack<>();
        
        for(int num : arr)
        {
            if(!st.empty() && num == st.peek())
            {
                continue;
            }
            st.push(num);
        }
        
        int[] answer = new int[st.size()];
        for(int i = st.size() - 1; i >= 0; i--)
        {
            answer[i] = st.pop();
        }

        return answer;
    }
}