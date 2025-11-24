class Solution {
    public int solution(int n) {
        int answer = 1;
        int temp = 1;
        
        while(n >= temp * (answer + 1)) {  
            answer++;
            temp *= answer;
        }
        
        return answer;
    }
}