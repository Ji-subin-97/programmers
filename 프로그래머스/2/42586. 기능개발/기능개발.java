import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> result = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        
        for(int i = 0; i < progresses.length; i++)
        {
            queue.offer((int) Math.ceil((double)(100 - progresses[i]) / speeds[i]));
        }
        
        int dDay = queue.poll();
        int count = 1;
        
        do{
            if(queue.peek() <= dDay)
            {
                queue.poll();
                count++;
            }
            else
            {
                result.add(count);
                
                dDay = queue.poll();
                count = 1;
            }
            
        } while (!queue.isEmpty());
        
        
        result.add(count);  // 마지막 배포
        
        return result.stream()
                    .mapToInt(e -> e)
                    .toArray();
    }
}