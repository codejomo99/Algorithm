class Solution {
    public int[][] solution(int[][] arr) {
        //행
        int m = arr.length;
        
        //렬
        int n = arr[0].length;
        
        
        if(m < n){
            int[][] answer = new int[n][n];
            for(int i = 0; i < m; i++){
                for(int j = 0; j < n; j++){
                    answer[i][j] = arr[i][j];
                }
            }
            return answer;
        }else if(m > n){
            int[][] answer = new int[m][m];
            for(int i = 0; i < m; i++){
                for(int j = 0; j < n; j++){
                    answer[i][j] = arr[i][j];
                }
            }
            return answer;
        }else{
            return arr;
        }
    }
}