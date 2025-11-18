class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        
        String snum = String.valueOf(num);
        int index = snum.indexOf(k + "");
        
        if(index != -1) index++;
        
        answer = index;
        
        return answer;
    }
}