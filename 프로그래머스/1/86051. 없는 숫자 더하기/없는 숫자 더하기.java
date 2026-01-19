class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        boolean[] numa = new boolean[10];
        
        for(int num : numbers) {
            numa[num] = true;
        }
        
        for(int i = 0; i < numa.length; i++) {
            if(!numa[i]) answer += i;
        }
        
        return answer;
    }
}