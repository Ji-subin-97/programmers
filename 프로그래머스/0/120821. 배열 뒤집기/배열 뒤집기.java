class Solution {
    public int[] solution(int[] num_list) {
        int alen = num_list.length;
        int[] answer = new int[alen];
        
        for(int i = 0; i < alen; i++) {
            answer[i] = num_list[alen - i - 1];
        }
        
        return answer;
    }
}