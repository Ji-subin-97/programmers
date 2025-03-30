class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        
        int sum = 0;
        int arrLength = arr.length;
        
        for(int item : arr)
        {
            sum += item;
        }
        
        answer = (double) sum / arrLength;
        
        return answer;
    }
}