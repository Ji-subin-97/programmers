class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        int max = A.length();
        
        for(int i = 0; i < max - 1; i++) {
            if(A.equals(B)) break;
            A = A.charAt(max - 1) + A.substring(0, max - 1);
            answer++;
        }
        
        if(!A.equals(B)) answer = -1;
         
        return answer;
    }
}