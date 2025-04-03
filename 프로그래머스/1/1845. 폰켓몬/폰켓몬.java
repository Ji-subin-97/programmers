import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int max = nums.length / 2;
        
        Set<Integer> set = Arrays.stream(nums)
                                    .boxed()
                                    .collect(Collectors.toSet());
        
        answer = set.size() < max ? set.size() : max;
        
        return answer;
    }
}