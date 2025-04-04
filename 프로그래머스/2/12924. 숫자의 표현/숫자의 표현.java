class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i = 1; i <= n / 2; i++)
        {
            int sum = 0;
            int num = i;
            
            while(sum <= n)
            {
                sum += num;
                num++;
                
                if(sum == n)
                {
                    answer++;
                }
                
            }
        }
        
        answer++; // 자기 자신 포함
        
        return answer;
    }
}