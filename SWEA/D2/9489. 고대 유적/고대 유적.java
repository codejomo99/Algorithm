import java.util.Arrays;
import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt(); // 테스트 케이스의 수

    for(int t = 1; t <= T; t++) {

      // 행
      int n = sc.nextInt();

      // 열
      int m = sc.nextInt();

      int[][] board = new int[n][m];

      // 초기화
      for(int i = 0; i < n; i++){
        for(int j = 0; j < m; j++) {
          board[i][j] = sc.nextInt();
        }
      }

      int max = Integer.MIN_VALUE;
      int count = 0;

      // 행 기준 탐색
      for(int i = 0; i < n; i++){
        for(int j = 0; j < m; j++){

          if(board[i][j] == 1){
            count++;
            max = Math.max(max,count);
          }else{
            count = 0;
          }

          if(j == m - 1) count = 0;

        }
      }

      count = 0;

      // 열 기준 탐색
      for(int i = 0; i < m; i++){
        for(int j = 0; j < n; j++){
          if(board[j][i] == 1){
            count++;
            max = Math.max(max,count);
          }else{
            count = 0;
          }

          if(j == n - 1) count = 0;

        }
      }

      System.out.println("#"+t+" "+max);

    }
    sc.close();
  }

}
