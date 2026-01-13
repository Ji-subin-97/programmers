class Solution {
    public int solution(int a, int b) {
        int x = Integer.valueOf(String.valueOf(a) + String.valueOf(b));
        int y = a * b * 2;
        
        return x > y ? x : y;
    }
}