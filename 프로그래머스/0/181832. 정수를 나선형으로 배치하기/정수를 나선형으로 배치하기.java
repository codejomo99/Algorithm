class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        
        // 우,하,좌,상
        int[] dr = {0,1,0,-1};
        int[] dc = {1,0,-1,0};
        
        int num = 1;
        int row = 0, col = 0;
        int direction = 0;
        
        while(num <= n * n){
            answer[row][col] = num++;
            int nextRow = row + dr[direction];
            int nextCol = col + dc[direction];
            
            if(nextRow < 0 || nextRow >= n || nextCol < 0 || nextCol >= n || answer[nextRow][nextCol] != 0){
                direction = (direction + 1) % 4;
                nextRow = row + dr[direction];
                nextCol = col + dc[direction];
            }
            
            row = nextRow;
            col = nextCol;
            
        }
        
       
        
        return answer;
    }
}