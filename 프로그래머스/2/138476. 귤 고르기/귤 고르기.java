import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        Map<Integer, Integer> box = new HashMap<>();
        
        for(int tan : tangerine)
        {
            box.put(tan, box.getOrDefault(tan, 0) + 1);
        }
        
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(box.entrySet());
        list.sort((a, b) -> b.getValue() - a.getValue());
        
        int sum = 0;
        
        for(Map.Entry<Integer, Integer> entry : list)
        {
            sum += entry.getValue();
            answer++;
            
            if(sum >= k) break;
        }
        
        return answer;
    }
}