import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        char[][] map = new char[N][N];
        for (int i = 0; i < N; i++) {
            map[i] = br.readLine().toCharArray();
        }

        StringBuilder result = new StringBuilder();
        int[] dx = {-1, -1, -1, 0, 1, 1, 1, 0};
        int[] dy = {-1, 0, 1, 1, 1, 0, -1, -1};

        int nx, ny = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                int count = 0;

                if (map[i][j] == '.') {
                    for (int k = 0; k < 8; k++) {
                        nx = i + dx[k];
                        ny = j + dy[k];

                        if (nx >= 0 && nx < N && ny >= 0 && ny < N) {
                            if (map[nx][ny] != '.') {
                                count += map[nx][ny] - '0';
                            }
                        }
                    }

                    if (count >= 10) {
                        result.append('M');
                    } else {
                        result.append(count);
                    }
                } else {
                    result.append('*');
                }
            }

            result.append('\n');
        }

        System.out.println(result);
    }
}
