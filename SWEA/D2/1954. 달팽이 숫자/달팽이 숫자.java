import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt(); // 테스트 케이스 수

    for (int t = 1; t <= T; t++) {
      int n = sc.nextInt(); // 달팽이 크기

      int[][] snail = new int[n][n];

      // 우, 하, 좌, 위
      int[] dx = {0,1,0,-1};
      int[] dy = {1,0,-1,0};

      // 이동할 위치 변수들
      int x = 0, y = 0, dir = 0, num = 1;

      while(num <= n * n){
        snail[x][y] = num++; // 0,0 에 넣고 num++

        int nx = x + dx[dir];
        int ny = y + dy[dir];

        if(nx < 0 || nx >= n || ny < 0 || ny >= n || snail[nx][ny] != 0){
          dir = (dir+1)%4;
          nx = x + dx[dir];
          ny = y + dy[dir];
        }

        x = nx;
        y = ny;
      }

      System.out.println("#"+t);
      for(int i = 0; i < n; i++){
        for(int j = 0; j < n; j++){
          System.out.print(snail[i][j]+" ");
        }
        System.out.println();
      }


    }
  }
}
