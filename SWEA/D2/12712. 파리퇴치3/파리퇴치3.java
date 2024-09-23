import java.util.Arrays;
import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt(); // 테스트 케이스의 수

    for(int t = 1; t <= T; t++){
      int n = sc.nextInt();
      int m = sc.nextInt();

      int[][] board = new int[n][n];

      for(int i = 0; i < n; i++){
        for(int j = 0; j < n; j++){
          board[i][j] = sc.nextInt();
        }
      }

      int[] dx = {-1,0,1,0};
      int[] dy = {0,1,0,-1};

      int[] mx = {-1,-1,1,1};
      int[] my = {-1,1,1,-1};

      int max = Integer.MIN_VALUE;

      for(int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
          int plus = board[i][j];

          for (int k = 1; k < m; k++) {
            for (int dir = 0; dir < 4; dir++) {
              int x = i + dx[dir] * k;
              int y = j + dy[dir] * k;

              if (x >= 0 && x < n && y >= 0 && y < n) {
                plus += board[x][y];
              }
            }
          }

          int gob = board[i][j];
          for (int k = 1; k < m; k++) {
            for (int dir = 0; dir < 4; dir++) {
              int x = i + mx[dir] * k;
              int y = j + my[dir] * k;

              if (x >= 0 && x < n && y >= 0 && y < n) {
                gob += board[x][y];
              }
            }
          }

          int currentMax = Math.max(plus, gob);
          max = Math.max(max, currentMax);
        }
      }

      System.out.println("#"+t+" "+max);



    }
  }

}
