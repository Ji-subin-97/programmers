import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        HashMap<String, Integer> hmap = new HashMap<>();

        for (int i = 0; i < want.length; i++) {
            hmap.put(want[i], number[i]);
        }

        for (int minDay = 0; minDay <= discount.length - 10; minDay++) {
            HashMap<String, Integer> hmap2 = new HashMap<>();

            for (int i = minDay; i < minDay + 10; i++) {
                hmap2.put(discount[i], hmap2.getOrDefault(discount[i], 0) + 1);
            }

            boolean flag = true;
            for (String key : hmap.keySet()) {
                if (!hmap2.containsKey(key) || !hmap2.get(key).equals(hmap.get(key))) {
                    flag = false;
                    break;
                }
            }

            if (flag) answer++;
        }

        return answer;
    }
}