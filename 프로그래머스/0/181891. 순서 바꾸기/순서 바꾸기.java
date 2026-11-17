class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        
        for(int i = 0; i < answer.length; i++) {
            if(n >= num_list.length) n %= num_list.length;
            answer[i] = num_list[n];
            n++;
        }
        
        return answer;
    }
}