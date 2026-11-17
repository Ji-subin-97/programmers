import java.util.Arrays;

class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        
        if(arr1.length == arr2.length) {
            int sum1 = Arrays.stream(arr1).sum();
            int sum2 = Arrays.stream(arr2).sum();
            
            answer = sum2 > sum1 ? -1 : sum2 < sum1 ? 1 : 0;
        } else {
            answer = arr2.length > arr1.length ? -1 : 1;
        }
        
        return answer;
    }
}