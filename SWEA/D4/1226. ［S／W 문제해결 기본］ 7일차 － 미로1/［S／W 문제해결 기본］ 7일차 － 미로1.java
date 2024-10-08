import java.io.FileInputStream;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Pointer {
  int x, y;

  public Pointer(int x, int y) {
    this.x = x;
    this.y = y;
  }
}

class Solution {
  static int[] dx = {-1, 0, 1, 0}; // 상, 우, 하, 좌
  static int[] dy = {0, 1, 0, -1};
  static int x, y, fx, fy;
  static int[][] board;

  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);

    for (int t = 1; t <= 10; t++) {
      int n = sc.nextInt();
      board = new int[16][16];

      for (int i = 0; i < 16; i++) {
        String s = sc.next();
        for (int j = 0; j < 16; j++) {
          int num = s.charAt(j) - '0';
          board[i][j] = num;

          if (board[i][j] == 2) {
            x = i;
            y = j;
          } else if (board[i][j] == 3) {
            fx = i;
            fy = j;
          }
        }
      }

      int result = bfs(x, y);
      System.out.println("#" + t + " " + result);
    }
  }

  public static int bfs(int x, int y) {
    Queue<Pointer> q = new LinkedList<>();
    boolean[][] visited = new boolean[16][16];
    q.offer(new Pointer(x, y));
    visited[x][y] = true;

    while (!q.isEmpty()) {
      Pointer p = q.poll();

      // 목표지점에 도달한 경우
      if (p.x == fx && p.y == fy) {
        return 1; // 도달 성공
      }

      for (int i = 0; i < 4; i++) {
        int nx = p.x + dx[i];
        int ny = p.y + dy[i];

        // 목표 위치가 3이거나 빈 공간인 경우
        if (nx >= 0 && nx < 16 && ny >= 0 && ny < 16 && (board[nx][ny] == 0 || board[nx][ny] == 3)) {
          if (!visited[nx][ny]) { // 방문하지 않은 경우
            visited[nx][ny] = true;
            q.offer(new Pointer(nx, ny));
          }
        }
      }
    }

    return 0; // 도달 실패
  }
}
