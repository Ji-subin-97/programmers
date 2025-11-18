import java.util.*;

class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        
        char[] b = before.toCharArray();
        char[] a = after.toCharArray();
        
        Arrays.sort(b);
        Arrays.sort(a);
        
        if(String.valueOf(b).equals(String.valueOf(a))) answer = 1;
        
        return answer;
    }
}