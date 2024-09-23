import java.util.Arrays;
import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt(); // 테스트 케이스의 수

    for(int t = 1; t <= T; t++){

      // 행
      int n = sc.nextInt();

      // 열
      int m = sc.nextInt();

      int[][] board = new int[n][m];

      for(int i = 0; i < n; i++){
        for(int j = 0; j < m; j++){
          board[i][j] = sc.nextInt();
        }
      }

      // 상,우,하,좌
      int[] dx = {-1,0,1,0};
      int[] dy = {0,1,0,-1};

      int maxValue = Integer.MIN_VALUE;


      for(int i = 0; i < n; i++){
        for(int j = 0; j < m; j++){

          int value = board[i][j];

          for(int k = 0; k < 4; k++){
            int x = i + dx[k];
            int y = j + dy[k];

            if(x >= 0 && x < n && y >= 0 && y < m){
              value += board[x][y];
            }
          }

          maxValue = Math.max(maxValue,value);
        }
      }

      System.out.println("#"+t+" "+maxValue);

    }
      sc.close();
  }

}
