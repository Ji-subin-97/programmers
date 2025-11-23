class Solution {
    public int solution(int[] array, int n) {
        int answer = Integer.MAX_VALUE;
        
        for(int num : array) {
            int distance = Math.abs(num - n);
            if(distance < Math.abs(answer - n)) {
                answer = num;
            } else if(distance == Math.abs(answer - n) && num < answer) {
                answer = num;
            }
        }
        
        return answer;
    }
}