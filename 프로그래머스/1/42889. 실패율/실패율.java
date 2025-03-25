import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        LinkedHashMap<Integer, Double> stageMap = new LinkedHashMap<>();

        Arrays.sort(stages);

        int totalPlayers = stages.length;
        int idx = 0;

        for (int cur = 1; cur <= N; cur++) {
            int stuck = 0;

            while (idx < stages.length && stages[idx] == cur) {
                stuck++;
                idx++;
            }

            double percent = (totalPlayers == 0) ? 0.0 : (double) stuck / totalPlayers;

            stageMap.put(cur, percent);

            totalPlayers -= stuck;
        }

        List<Map.Entry<Integer, Double>> list = new ArrayList<>(stageMap.entrySet());
        list.sort((a, b) -> {
            if (b.getValue().equals(a.getValue())) {
                return a.getKey() - b.getKey();
            }
            return b.getValue().compareTo(a.getValue());
        });

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i).getKey();
        }

        return answer;
    }
}