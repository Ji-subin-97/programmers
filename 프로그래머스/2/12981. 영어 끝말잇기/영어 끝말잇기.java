import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {0, 0};
        Set<String> used = new HashSet<>();
        
        used.add(words[0]);
        String prev = words[0];

        int num = 2;    // 두번째 사람부터 검사
        int cycle = 1;
        
        for (int i = 1; i < words.length; i++) {
            String word = words[i];
            
            if (used.contains(word) || word.length() <= 1 || prev.charAt(prev.length() - 1) != word.charAt(0)) {
                answer[0] = num;
                answer[1] = cycle;
                break;
            }

            used.add(word);
            prev = word;

            num++;
            if (num > n) {
                num = 1;
                cycle++;
            }
        }

        return answer;
    }
}