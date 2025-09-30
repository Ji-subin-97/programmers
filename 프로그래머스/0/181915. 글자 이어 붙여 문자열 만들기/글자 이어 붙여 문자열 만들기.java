class Solution {
    public String solution(String my_string, int[] index_list) {
        StringBuilder sb = new StringBuilder();
        char[] ca = my_string.toCharArray();
        
        for(int n : index_list) {
            sb.append(ca[n]);
        }
        
        return sb.toString();
    }
}