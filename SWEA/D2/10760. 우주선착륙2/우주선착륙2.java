import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();  // 총 테스트 케이스 수
    for (int t = 1; t <= T; t++) {
      int n = sc.nextInt();
      int m = sc.nextInt();

      int[][] board = new int[n][m];

      for(int i = 0; i < n; i++){
        for(int j = 0; j < m; j++){
          board[i][j] = sc.nextInt();
        }
      }

      int[] dx = {-1,-1,-1,0,1,1,1,0};
      int[] dy = {-1,0,1,1,1,0,-1,-1};

      int result = 0;

      for(int i = 0; i < n; i++){
        for(int j = 0; j < m; j++){
          int value = board[i][j];
          int cnt = 0;

          for(int k = 0; k < 8; k++){
            int x = i + dx[k];
            int y = j + dy[k];

            if(x >= 0 && x < n && y >= 0 && y < m){
              if(value > board[x][y]){
                cnt++;
              }
            }
          }

          if(cnt >= 4){
            result++;
          }
        }
      }

      System.out.println("#"+t+" "+result);


    }
    sc.close();
  }
}
