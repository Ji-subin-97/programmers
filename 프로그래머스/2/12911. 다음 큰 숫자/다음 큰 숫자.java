class Solution {
    
    int firstCount = 0;
    int secondCount = 0;
    
    public int solution(int n) {
        int answer = 0;
        String numStr = Integer.toBinaryString(n);

        firstCount = countCharacter(numStr);
        
        for(int i = n + 1; i <= 1000000; i++)
        {
            secondCount = countCharacter(Integer.toBinaryString(i));
            
            if(firstCount == secondCount)
            {
                answer = i;
                break;
            }
        }
        
        return answer;
    }
    
    public int countCharacter(String str)
    {
        int count = 0;
        
        for(int i = 0; i < str.length(); i++)
        {
            if(str.charAt(i) == '1')
            {
                count++;
            }
        }
        
        return count;
    }
}