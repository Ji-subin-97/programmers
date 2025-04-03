class Solution {
    public int[] solution(long n) {
        StringBuilder sb = new StringBuilder(String.valueOf(n)).reverse();
        String str = sb.toString();
        
        int[] answer = new int[str.length()];
        
        for(int i = 0; i < answer.length; i++)
        {
            answer[i] = Character.getNumericValue(str.charAt(i));
        }
        
        return answer;
    }
}