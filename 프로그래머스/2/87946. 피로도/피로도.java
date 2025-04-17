class Solution {
    boolean[] visited;
    int max = 0;
    
    public int solution(int k, int[][] dungeons) {
        visited = new boolean[dungeons.length];
        
        dfs(k, dungeons, 0);
        
        return max;
    }
    
    public void dfs(int k, int[][] dungeons, int count)
    {
        for(int i = 0; i < dungeons.length; i++)
        {
            if(k >= dungeons[i][0] && !visited[i])
            {
                visited[i] = true;
                dfs(k - dungeons[i][1], dungeons, count + 1);
                visited[i] = false;
            }
        }
        
        max = Math.max(max, count);
    }
    
    
}