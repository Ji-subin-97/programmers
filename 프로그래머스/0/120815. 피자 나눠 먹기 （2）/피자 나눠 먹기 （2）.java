class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i = 1; i <= n; i++) {
            int piece = i * 6;
            
            if(piece % n == 0) {
                answer = i;
                break;
            }
        }
        
        return answer;
    }
}