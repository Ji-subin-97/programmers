class Solution {
    public int solution(int n) {
        int answer = 0;
    
        if(n <= 1) return n;
        
        int prev = 0, curr = 1;
        for(int i = 2; i <= n; i++)
        {
            int temp = curr;
            curr = (curr + prev) % 1234567;
            prev = temp;
        }
        
        answer = curr;
        
        return answer;
    }
}