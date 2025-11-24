class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] sa = my_string.split(" ");
        String temp = "+";
        
        for(String s : sa) {
            if(s.equals("+")) {
                temp = "+";
            } else if(s.equals("-")) {
                temp = "-";
            } else {
                if(temp.equals("+")) {
                    answer += Integer.valueOf(s);
                } else {
                    answer -= Integer.valueOf(s);
                }
            }
            
        }
        
        return answer;
    }
}