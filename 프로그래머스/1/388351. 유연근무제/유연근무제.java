class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;

        for (int i = 0; i < timelogs.length; i++) {
            boolean isFortunate = true;
            
            int schedulesTime = schedules[i] + 10;
            if (schedulesTime % 100 >= 60) {
                schedulesTime = (schedulesTime / 100 + 1) * 100 + (schedulesTime % 100 - 60);
            }

            for (int j = 0; j < 7; j++) {
                if (!((j + startday) % 7 == 0 || (j + startday) % 7 == 6) && timelogs[i][j] > schedulesTime) {
                    isFortunate = false;
                    break;
                }
            }

            if (isFortunate) {
                answer++;
            }
        }
        
        return answer;
    }
}