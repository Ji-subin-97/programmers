import java.util.Arrays;

class Solution {
    public int solution(int[] num_list) {
        int multiply = Arrays.stream(num_list).reduce(1, (a, b) -> a * b);
        int power = (int) Math.pow(Arrays.stream(num_list).sum(), 2);
        
        return multiply < power ? 1 : 0;
    }
}