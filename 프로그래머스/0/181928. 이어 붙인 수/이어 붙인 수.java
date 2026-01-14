class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        StringBuilder oddstr = new StringBuilder();
        StringBuilder evenstr = new StringBuilder();
        
        for(int num : num_list) {
            if(num % 2 != 0) {
                oddstr.append(num);
            } else {
                evenstr.append(num);
            }
        }
        
        answer = Integer.parseInt(oddstr.toString()) + Integer.parseInt(evenstr.toString());
        
        return answer;
    }
}