class Solution {
    public int[][] solution(int[] num_list, int n) {
        int rows = num_list.length / n;
        int[][] answer = new int[rows][n];

        int listIndex = 0;

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < n; c++) {
                answer[r][c] = num_list[listIndex];
                listIndex++;
            }
        }

        return answer;
    }
}