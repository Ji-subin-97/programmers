import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] sc = s.split("");
        Map<String, Integer> smap = new HashMap<>();
        
        for(String sa : sc) {
            smap.put(sa, smap.getOrDefault(sa, 0) + 1);
        }
        
        for(Map.Entry<String, Integer> entry : smap.entrySet()) {
            if(entry.getValue() == 1) answer += entry.getKey();
        }
        
        char[] ca = answer.toCharArray();
        
        Arrays.sort(ca);
        
        answer = String.valueOf(ca);
        
        return answer;
    }
}