import java.util.Arrays;
import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt(); // 테스트 케이스의 수

    for(int t = 1; t <= T; t++) {
      int n = sc.nextInt();
      int m = sc.nextInt();

      int[][] board = new int[n][m];

      for(int i = 0; i < n; i++){
        for(int j = 0; j < m; j++){
          board[i][j] = sc.nextInt();
        }
      }

      int[] dx = {-1,0,1,0};
      int[] dy = {0,1,0,-1};

      int max = Integer.MIN_VALUE;
      for(int i = 0; i < n; i++){
        for(int j = 0; j < m; j++){
          int value = board[i][j];
          int total = value;

          for(int v = 1; v <= value; v++){
            for(int k = 0; k < 4; k++){
              int x = i + dx[k] * v;
              int y = j + dy[k] * v;

              if(x >= 0 && x < n && y >= 0 && y < m){
                total += board[x][y];
              }
            }
          }

          max = Math.max(max,total);
        }
      }

      System.out.println("#"+t+" "+max);


    }
    sc.close();
  }

}
