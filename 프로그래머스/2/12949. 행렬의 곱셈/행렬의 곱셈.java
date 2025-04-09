class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int larr1 = arr1.length;
        int larr2 = arr1[0].length;
        int larr3 = arr2[0].length;
        int[][] answer = new int[larr1][larr3];
        
        for(int i = 0; i < larr1; i++)
        {
            for(int j = 0; j < larr3; j++)
            {
                for(int k = 0; k < larr2; k++)
                {
                   answer[i][j] += arr1[i][k] * arr2[k][j]; 
                } 
            }
        }
        
        return answer;
    }
}