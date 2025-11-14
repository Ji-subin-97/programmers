import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        List<Integer> li = new ArrayList<>();
        
        for(char c : my_string.toCharArray()) {
            if(c >= '0' && c <= '9') li.add(Integer.parseInt(c + ""));
        }
        
        return li.stream().sorted().mapToInt(Integer::intValue).toArray();
    }
}