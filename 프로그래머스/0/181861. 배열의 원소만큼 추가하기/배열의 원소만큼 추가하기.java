import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> al = new ArrayList<>();
        
        for(int num : arr) {
            for(int i = 0; i < num; i++) {
                al.add(num);
            }
        }
        
        return al.stream().mapToInt(Integer::intValue).toArray();
    }
}