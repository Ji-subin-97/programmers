import java.util.*;

class Solution {
    public int[] solution(int n) {
        int count = 0;
        
        for(int i = 1; i * i <= n; i++) {
            if(n % i == 0) {
                if(i * i == n) count++;
                else count += 2;
            }
        }
        
        int[] answer = new int[count];
        int idx = 0;

        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                answer[idx++] = i;

                if (i * i != n) {
                    answer[idx++] = n / i;
                }
            }
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}