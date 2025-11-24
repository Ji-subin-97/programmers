import java.util.*;

class Solution {
    public int[] solution(int n) {
        List<Integer> li = new ArrayList<>();
        
        for(int i = 2; i <= Math.sqrt(n); i++) {
            while(n % i == 0) {
                li.add(i);
                n /= i;
            }
        }
        
        if(n > 1) {
            li.add(n);
        }
        
        return li.stream().mapToInt(Integer::valueOf).distinct().toArray();
    }
}