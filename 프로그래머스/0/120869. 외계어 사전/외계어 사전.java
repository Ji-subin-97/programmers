import java.util.*;

class Solution {
    public int solution(String[] spell, String[] dic) {
        char[] target = String.join("", spell).toCharArray();
        Arrays.sort(target);

        for (String word : dic) {
            if (word.length() != spell.length) continue;

            char[] arr = word.toCharArray();
            Arrays.sort(arr);

            if (Arrays.equals(arr, target)) {
                return 1;
            }
        }

        return 2;
    }
}