class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        
        int start = Integer.MIN_VALUE;
        int end = Integer.MAX_VALUE;
        
        if(a == b) return a;
        else if(a < b)
        {
            start = a;
            end = b;
        }
        else
        {
            start = b;
            end = a;
        }
        
        for(int i = start; i <= end; i++)
        {
            answer += i;
        }
        
        return answer;
    }
}