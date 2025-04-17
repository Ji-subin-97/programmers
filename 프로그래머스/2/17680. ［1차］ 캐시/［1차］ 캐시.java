import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        int count = 1;
        LRUCache lruc = new LRUCache(cacheSize);
        
        for(String city : cities)
        {
            city = city.toLowerCase();
            
            if(lruc.containsKey(city)) {
                answer += 1;
            }
            else {
                answer += 5;
            }
            
            lruc.put(city, count);
            count++;
        }
        
        
        return answer;
    }
    
    
    public class LRUCache extends LinkedHashMap<String, Integer> {
        
        private int capacity;

        public LRUCache (int capacity) {
            super(capacity, 0.75f, true);
            this.capacity = capacity;
        }

        @Override
        protected boolean removeEldestEntry(Map.Entry<String, Integer> eldest) {
            return size() > capacity;
        }

    }
    
}
