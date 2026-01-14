class Solution {
    public int solution(int n) {
        int oddSum = 0;
        int evenSum = 0;
        String oe = n % 2 == 0 ? "even" : "odd";
        
        while(n > 0) {
            if(n % 2 != 0) {
                oddSum += n;
            } else {
                evenSum += n * n;
            }
            
            n--;
        }
        
        return oe.equals("even") ? evenSum : oddSum;
    }
}