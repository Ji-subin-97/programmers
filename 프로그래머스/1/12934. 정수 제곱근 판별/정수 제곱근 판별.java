class Solution {
    public long solution(long n) {
        long answer = 0;
        double num = Math.sqrt(n);
        
        answer = num == (long) num ? (long)Math.pow(num + 1, 2) : -1;
        
        return answer;
    }
}