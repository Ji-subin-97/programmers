class Solution {
    public int solution(String s) {
        int answer = 0;
        
        String[] sarr = s.split(" ");
        
        for(int i = 0; i < sarr.length; i++) {
            if(sarr[i].equals("Z")) {
                answer -= Integer.valueOf(sarr[i - 1]);
            } else {
                answer += Integer.valueOf(sarr[i]);
            }
        }
        
        return answer;
    }
}