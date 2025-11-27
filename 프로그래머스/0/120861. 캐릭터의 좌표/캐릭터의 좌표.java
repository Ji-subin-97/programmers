class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0, 0};
        int maxX = board[0] / 2;
        int maxY = board[1] / 2;

        for(String input : keyinput) {
            int nx = answer[0];
            int ny = answer[1];

            if(input.equals("up")) {
                ny++;
            } else if(input.equals("down")) {
                ny--;
            } else if(input.equals("left")) {
                nx--;
            } else { // right
                nx++;
            }

            if(Math.abs(nx) <= maxX && Math.abs(ny) <= maxY) {
                answer[0] = nx;
                answer[1] = ny;
            }
        }

        return answer;
    }
}