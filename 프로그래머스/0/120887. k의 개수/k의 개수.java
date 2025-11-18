class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        
        for(int x = i; x <= j; x++) {
            char[] ca = String.valueOf(x).toCharArray();
            
            for(int y = 0; y < ca.length; y++) {
                if(ca[y] - '0' == k) answer++;
            }
            
        }
        
        return answer;
    }
}