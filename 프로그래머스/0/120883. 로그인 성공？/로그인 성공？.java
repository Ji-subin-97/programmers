class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "";
        
        String id = id_pw[0];
        String pw = id_pw[1];
        
        for(String[] user : db) {
            if(id.equals(user[0])) {
                if(pw.equals(user[1])) {
                    answer = "login";
                    break;
                } else {
                    answer = "wrong pw";
                    break;
                }
            } else {
                answer = "fail";
            }
        }
        
        return answer;
    }
}