import java.util.Scanner;

class Main {

    static int n, m;
    static int[][] board;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int result = 0;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        board = new int[n][m];

        int x = 0, y = 0;
        // 0 빈공간, 1 도연이, 2 사람, 3 벽
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            for (int j = 0; j < m; j++) {
                char c = s.charAt(j);
                if (c == 'O') {
                    board[i][j] = 0;  // 빈 공간
                } else if (c == 'P') {
                    board[i][j] = 2;  // 사람
                } else if (c == 'I') {
                    board[i][j] = 1;  // 도연이
                    x = i;  // 도연이 시작 위치 저장
                    y = j;
                } else if (c == 'X') {
                    board[i][j] = 3;  // 벽
                }
            }
        }

        dfs(x, y);

        // 만약 result가 0이라면 아무도 찾지 못했으므로 "TT" 출력
        if (result == 0) {
            System.out.println("TT");
        } else {
            System.out.println(result);
        }
    }

    public static void dfs(int x, int y) {
        // 사람이 있을 경우 result 증가
        if (board[x][y] == 2) {
            result++;
        }

        // 방문한 위치는 4로 마킹
        board[x][y] = 4;

        // 4방향 탐색
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            // 범위를 벗어나지 않고, 빈 공간(0) 또는 사람이 있는 곳(2)만 이동 가능
            if (nx >= 0 && nx < n && ny >= 0 && ny < m && (board[nx][ny] == 0 || board[nx][ny] == 2)) {
                dfs(nx, ny);
            }
        }
    }
}
