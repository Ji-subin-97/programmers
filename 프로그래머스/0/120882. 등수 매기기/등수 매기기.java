class Solution {
    public int[] solution(int[][] score) {
        int n = score.length;
        
        double[] scores = new double[n];
        int[] rank = new int[n];
        
        for(int i = 0; i < n; i++) {
            scores[i] = (score[i][0] + score[i][1]) / 2.0;
        }
        
        for(int i = 0; i < n; i++) {
            int count = 1;
            
            for(int j = 0; j < n; j++) {
                if(scores[j] > scores[i]) count++;
            }
            
            rank[i] = count;
        }
        
        return rank;
    }
}