import java.util.*;

public class Solution {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt(); // 테스트 케이스 수

    for (int t = 1; t <= T; t++) {
      int n = sc.nextInt();

      int[][] board = new int[n][n];

      for(int i = 0; i < n; i++){
        String line = sc.next();
        for(int j = 0; j < n; j++){
          board[i][j] = line.charAt(j) - '0';
        }
      }

      int mid = (n/2);
      int total = 0;

      for(int i = 0; i < n; i++){
        int start = Math.abs(mid-i);
        int end = n-start;
        for(int j = start; j < end; j++){
          total += board[i][j];
        }
      }

      System.out.printf("#%d %d\n",t,total);

    }
  }



}

