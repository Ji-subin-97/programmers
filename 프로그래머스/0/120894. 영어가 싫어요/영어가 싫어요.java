import java.util.*;

class Solution {
    public long solution(String numbers) {
        long answer = 0;

        Map<String, String> maps = Map.ofEntries (
            Map.entry("zero", "0"),
            Map.entry("one", "1"),
            Map.entry("two", "2"),
            Map.entry("three", "3"),
            Map.entry("four", "4"),
            Map.entry("five", "5"),
            Map.entry("six", "6"),
            Map.entry("seven", "7"),
            Map.entry("eight", "8"),
            Map.entry("nine", "9")
        );
        
        for(Map.Entry<String, String> entry : maps.entrySet()) {
            numbers = numbers.replace(entry.getKey(), entry.getValue());
        }
        
        answer = Long.valueOf(numbers);
        
        return answer;
    }
}