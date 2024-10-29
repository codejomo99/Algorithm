import java.io.IOException;
import java.util.Scanner;

class Solution {
    static int N, res, mCnt[][];
    static char map[][];
    static int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1}, dy = {0, 1, 1, 1, 0, -1, -1, -1};

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int t = 1; t <= T; t++) {

            N = sc.nextInt();
            res = 0;
            map = new char[N][N];
            mCnt = new int[N][N];

            // 입력
            for (int i = 0; i < N; i++) {
                String s = sc.next();
                for (int j = 0; j < N; j++) {
                    map[i][j] = s.charAt(j);
                }
            }

            // 주변 지뢰 세기
            countMine();

            // 지뢰가 없는 부분 부터 클릭
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (mCnt[i][j] == 0 && map[i][j] != '*') {
                        click(i, j);
                        res++;
                    }
                }
            }

            // 아직 눌리지 않은 곳이 있다면 눌러주자.
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    // 주변에 지뢰가 있지만 현 위지가 지뢰가 아니라면
                    if (mCnt[i][j] > 0 && map[i][j] != '*') {
                        res++;
                    }
                }
            }

            System.out.println("#" + t + " " + res);

        }

    }

    public static void click(int x, int y) {
        int now = mCnt[x][y];
        mCnt[x][y] = -1;

        if (now == 0) {
            for (int d = 0; d < 8; d++) {
                int nx = x + dx[d];
                int ny = y + dy[d];

                if (nx >= 0 && nx < N && ny >= 0 && ny < N && map[nx][ny] != '*') {
                    click(nx, ny);
                }
            }
        }

    }

    public static void countMine() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (map[i][j] == '.') {
                    int cnt = 0;
                    for (int d = 0; d < 8; d++) {
                        int nx = i + dx[d];
                        int ny = j + dy[d];

                        if (nx >= 0 && nx < N && ny >= 0 && ny < N && map[nx][ny] == '*') {
                            cnt++;
                        }
                    }
                    mCnt[i][j] = cnt;
                }
            }


        }
    }


}
