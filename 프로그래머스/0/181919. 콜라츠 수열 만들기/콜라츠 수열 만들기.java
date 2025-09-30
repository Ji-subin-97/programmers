import java.util.*;

class Solution {
    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();
        int[] answer = {};
        
        while(n > 1) {
            list.add(n);
            n = n % 2 == 0 ? n / 2 : 3 * n + 1;
            
            if(n == 1) list.add(n);
        }
        
        answer = list.stream().mapToInt(Integer::intValue).toArray();
        
        return answer;
    }
}