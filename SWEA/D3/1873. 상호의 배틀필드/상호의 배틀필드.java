import java.util.Scanner;

class Solution {
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int tankDir, tankX, tankY;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t = 1; t <= T; t++) {
            int h = sc.nextInt();
            int w = sc.nextInt();
            tankDir = 0;
            tankX = 0;
            tankY = 0;

            // 맵 크기
            char[][] map = new char[h][w];

            for (int i = 0; i < h; i++) {
                String line = sc.next();
                for (int j = 0; j < w; j++) {
                    map[i][j] = line.charAt(j);
                    if (map[i][j] == '^') {
                        tankDir = 0;
                        tankX = i;
                        tankY = j;
                    } else if (map[i][j] == 'v') {
                        tankDir = 1;
                        tankX = i;
                        tankY = j;
                    } else if (map[i][j] == '<') {
                        tankDir = 2;
                        tankX = i;
                        tankY = j;
                    } else if (map[i][j] == '>') {
                        tankDir = 3;
                        tankX = i;
                        tankY = j;
                    }
                }
            }

            int n = sc.nextInt();
            String line = sc.next();
            for (int i = 0; i < n; i++) {
                if (line.charAt(i) == 'S') {
                    shoot(map);
                } else {
                    forward(line.charAt(i), map);
                }
            }
            System.out.print("#" + t + " ");
            printMap(map);


        }
        System.out.println();
    }

    public static void printMap(char[][] map) {
        for (char[] ch : map) {
            System.out.println(new String(ch));
        }
    }

    private static boolean isCheck(int x, int y, char[][] map) {
        return x >= 0 && x < map.length && y >= 0 && y < map[x].length;
    }

    public static void shoot(char[][] map) {
        int nx = tankX + dx[tankDir];
        int ny = tankY + dy[tankDir];

        while (isCheck(nx, ny, map)) {
            if (map[nx][ny] == '*') {
                map[nx][ny] = '.';
                return;
            } else if (map[nx][ny] == '#') {
                return;
            }
            nx += dx[tankDir];
            ny += dy[tankDir];
        }
    }

    public static void forward(char d, char[][] map) {
        char mark = ' ';
        switch (d) {
            case 'U':
                tankDir = 0;
                mark = '^';
                break;
            case 'D':
                tankDir = 1;
                mark = 'v';
                break;
            case 'L':
                tankDir = 2;
                mark = '<';
                break;
            case 'R':
                tankDir = 3;
                mark = '>';
                break;
            default:
                break;
        }

        map[tankX][tankY] = mark;

        int nx = dx[tankDir] + tankX;
        int ny = dy[tankDir] + tankY;
        if (!isCheck(nx, ny, map)) {
            return;
        }
        if (map[nx][ny] == '.') {
            map[nx][ny] = mark;
            map[tankX][tankY] = '.';
            tankX = nx;
            tankY = ny;
        }

    }


}
