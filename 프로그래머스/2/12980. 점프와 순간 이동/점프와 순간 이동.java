import java.util.*;

public class Solution {
    public int solution(int n) {
        int ans = 0;
        
        String str = Integer.toBinaryString(n);
        for(char ch : str.toCharArray())
        {
            if(ch == '1')
            {
                ans++;
            }
        }
        
        return ans;
    }
}