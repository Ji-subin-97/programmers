import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        
        Arrays.sort(d);
        
        for(int i = d.length; i > 0; i--)
        {
            int sum = 0; 
            for(int j = 0; j < i; j++)
            {
                sum += d[j];
            }
            
            if(budget >= sum)
            {
                answer = i;
                break;
            }
        }
        
        return answer;
    }
}