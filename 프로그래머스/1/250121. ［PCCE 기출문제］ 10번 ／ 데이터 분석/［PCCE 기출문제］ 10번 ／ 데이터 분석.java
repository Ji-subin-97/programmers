import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Arrays;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        int[][] answer = {};
        
        Map<String, Integer> lmap = new LinkedHashMap<String, Integer>() {
            {
                put("code", 0);
                put("date", 1);
                put("maximum", 2);
                put("remain", 3);
            }
        };
        
        int extNum = lmap.get(ext);
        int sortNum = lmap.get(sort_by);
        
        for(int[] item : data)
        {
           if(item[extNum] < val_ext)
           {
               int[][] temp = new int[answer.length + 1][item.length];
               
               System.arraycopy(answer, 0, temp, 0, answer.length);
               temp[answer.length] = item;
               
               answer = temp;
           }
        }
        
        Arrays.sort(answer, (a, b) -> { return a[sortNum]-b[sortNum]; });
        
        return answer;
    }
}