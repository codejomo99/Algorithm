import java.util.*;
class Solution {
    public int[] solution(int n) {
        int[][] arr = new int[n][n];
        int dir = 0; 
        int[] dp = new int[n+1];
        dp[1] = 1;
        
        
        for(int i = 1; i<=n; i++){
            dp[i] = dp[i-1] + i;
        }
        int[] answer = new int[dp[n]];

        int num = 1;
        int x = 0;
        int y = 0;
        
        while(true){
            arr[x][y] = num;
            
            if(dir == 0 && (x == n-1 || (x < n-1 && arr[x+1][y] != 0 ))){
                dir = 1;
            }else if(dir == 1 && (y == n-1 || (y < n-1 && arr[x][y+1] != 0))){
                dir = 2;
            }else if(dir == 2 && (x > 0 && arr[x-1][y-1] != 0)){
                dir = 0;
            }
            
            if(dir == 0){
                x++;    
            }else if(dir == 1){
                y++;
            }else if(dir == 2){
                x--;
                y--;
            }
            
            if(num == dp[n]) break;
            num++;
        }
        
        int index = 0;
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                if(arr[i][j] != 0){
                    answer[index++] = arr[i][j];
                }
            }   
        }
            
        return answer;
    }
}
