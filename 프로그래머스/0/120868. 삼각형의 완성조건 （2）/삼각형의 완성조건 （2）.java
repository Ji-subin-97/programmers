import java.util.*;

class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        
        Arrays.sort(sides);
        int min = sides[0];
        int max = sides[1];
        
        for(int i = 1; i <= max; i++) {
            if(i + min > max) answer++;
        }
        
        answer += min - 1;
        
        return answer;
    }
}