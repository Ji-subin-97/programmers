class Solution {
    public int solution(String dartResult) {
        int[] scores = new int[3];
        int idx = 0;
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < dartResult.length(); i++) {
            char ch = dartResult.charAt(i);
            
            if (Character.isDigit(ch)) {
                sb.append(ch);
            } 
            else if (ch == 'S' || ch == 'D' || ch == 'T') {
                int score = Integer.parseInt(sb.toString());
                sb.setLength(0);
                
                if (ch == 'S') score = (int) Math.pow(score, 1);
                if (ch == 'D') score = (int) Math.pow(score, 2);
                if (ch == 'T') score = (int) Math.pow(score, 3);
                
                scores[idx++] = score;
            }
            else if (ch == '*' || ch == '#') {
                if (ch == '*') {
                    scores[idx - 1] *= 2;
                    
                    if (idx - 2 >= 0) {
                        scores[idx - 2] *= 2;
                    }
                } 
                else if (ch == '#') {
                    scores[idx - 1] *= -1;
                }
            }
        }

        return scores[0] + scores[1] + scores[2];
    }
    
}