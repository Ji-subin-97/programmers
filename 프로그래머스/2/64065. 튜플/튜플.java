import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = {};
        
        String[] sarr = s.substring(2, s.length() - 2).split("\\},\\{");
        Arrays.sort(sarr, (a, b) -> a.length() - b.length());
        
        ArrayList<Integer> list = new ArrayList<>();
        Set<Integer> hset = new HashSet<>();
        
        for(String sa : sarr) {
            String[] nums = sa.split(",");
            
            for(String num : nums) {
                int n = Integer.parseInt(num);
                
                if(!hset.contains(n)) {
                    list.add(n);
                    hset.add(n);
                }
            }
        }
        
        answer = list.stream().mapToInt(i -> i).toArray();
        
        return answer;
    }
}