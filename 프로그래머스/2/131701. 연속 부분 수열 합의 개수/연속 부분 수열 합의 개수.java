import java.util.*;

class Solution {
    public int solution(int[] elements) {
        int answer = 0;
        int len = elements.length;
        HashSet<Integer> hset = new HashSet<>();
        
        for(int i = 1; i <= len; i++)
        {
            for(int j = 0; j < len; j++)
            {
                int sum = 0;
                for(int k = 0; k < i; k++)
                {
                    sum += elements[(j + k) % len];
                }
                hset.add(sum);
            }
        }
        
        answer = hset.size();
        
        return answer;
    }
}