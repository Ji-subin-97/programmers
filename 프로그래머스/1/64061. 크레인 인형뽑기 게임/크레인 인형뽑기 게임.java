import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> basket = new Stack<>();

        for (int i = 0; i < moves.length; i++) 
        {
            int col = moves[i] - 1;

            for (int row = 0; row < board.length; row++) 
            {
                if (board[row][col] != 0) { 
                    int curr = board[row][col];
                    board[row][col] = 0;

                    if (!basket.isEmpty() && basket.peek() == curr) {
                        basket.pop();
                        answer += 2;
                    } else {
                        basket.push(curr);
                    }
                    break;
                }
            }
        }

        return answer;
    }
}