class Solution {
    public String solution(String new_id) {
        String answer = "";
        int size = new_id.length();
        
        // 1
        new_id = new_id.toLowerCase();
        
        // 2
        new_id = new_id.replaceAll("[^a-z0-9-_.]", "");
        
        // 3
        new_id = new_id.replaceAll("\\.{2,}", ".");
        
        // 4
        new_id = new_id.replaceAll("^\\.|\\.$", "");
        
        // 5
        if(new_id.isEmpty())
        {
            new_id = "a";
        }
        
        // 6
        size = new_id.length();
        if(size >= 16)
        {
            new_id = new_id.substring(0, 15);
            int index = new_id.lastIndexOf('.');
            
            if (index == new_id.length() - 1) 
            {
                new_id = new_id.substring(0, index);
            }
        }
        // 7
        else if(size <= 2)
        {
            new_id += (new_id.charAt(size - 1) + "").repeat(3 - size); 
        }
        
        answer = new_id;
        
        return answer;
    }
}