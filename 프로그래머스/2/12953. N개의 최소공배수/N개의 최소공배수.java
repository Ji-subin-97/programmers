class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int lcm = arr[0];
        
        for(int i = 0; i < arr.length - 1; i++)
        {
            lcm = LCM(lcm, arr[i + 1]);
        }
        
        answer = lcm;
        
        return answer;
    }
    
    public int GCD(int a, int b)
    {
        int r = 0;
        
        while(b != 0)
        {
            r = a % b;
            a = b;
            b = r;
        }
        
        return a;
    }
    
    public int LCM(int a, int b)
    {
        return (a * b) / GCD(a , b);
    }
    
}