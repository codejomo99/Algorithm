import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Main {

    static int n, m;
    static int[][] board;
    static int[] dx = {0, -1, 0, 1};
    static int[] dy = {-1, 0, 1, 0};

    static boolean[][] visited;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        board = new int[n][m];
        visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            String s = sc.next();
            for (int j = 0; j < m; j++) {
                int num = s.charAt(j) - '0';
                board[i][j] = num;
            }
        }

        System.out.println(bfs(0, 0));
        sc.close();
    }

    public static int bfs(int x, int y) {
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{x, y});
        visited[x][y] = true;

        int L = 1; // 거리 초기화

        while (!q.isEmpty()) {
            int size = q.size(); // 현재 레벨의 크기

            for (int i = 0; i < size; i++) {
                int[] temp = q.poll();
                int xx = temp[0];
                int yy = temp[1];

                // 목표 지점에 도달했을 때
                if (xx == n - 1 && yy == m - 1) {
                    return L;
                }

                // 인접한 정점 탐색
                for (int j = 0; j < 4; j++) {
                    int nx = xx + dx[j];
                    int ny = yy + dy[j];

                    // 유효한 범위와 조건을 확인
                    if (nx >= 0 && nx < n && ny >= 0 && ny < m && board[nx][ny] == 1 && !visited[nx][ny]) {
                        visited[nx][ny] = true;  // 방문 처리
                        q.offer(new int[]{nx, ny});  // 큐에 추가
                    }
                }
            }
            L++; // 레벨이 끝난 후 거리 증가
        }

        return -1; // 경로가 없을 경우
    }
}
