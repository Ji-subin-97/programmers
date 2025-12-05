import java.util.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
        Integer[] boxed_numlist = Arrays.stream(numlist).boxed().toArray(Integer[]::new); 
        
        Arrays.sort(boxed_numlist, (a, b) -> {
            int distance = Math.abs(a - n) - Math.abs(b - n);
            if(distance == 0) return b - a;
            return distance;
        });
        
        return Arrays.stream(boxed_numlist).mapToInt(Integer::intValue).toArray();
    }
}