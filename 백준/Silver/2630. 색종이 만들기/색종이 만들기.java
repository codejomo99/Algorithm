import java.util.Scanner;

class Main {

    static int blue, white, n;
    static int[][] board;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        board = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        dfs(0, 0, n);

        System.out.println(white);
        System.out.println(blue);

    }


    public static void dfs(int row, int col, int size) {

        if (checkColor(row, col, size)) {
            if (board[row][col] == 1) {
                blue++;
            } else {
                white++;
            }

            return;
        }

        int nSize = size / 2;

        // 1사분면
        dfs(row, col, nSize);
        // 2사분면
        dfs(row, col + nSize, nSize);
        // 3사분면
        dfs(row + nSize, col, nSize);
        // 4사분면
        dfs(row + nSize, col + nSize, nSize);


    }


    public static boolean checkColor(int row, int col, int size) {
        int color = board[row][col];

        for (int i = row; i < row + size; i++) {
            for (int j = col; j < col + size; j++) {
                if (board[i][j] != color) {
                    return false;
                }
            }
        }

        return true;
    }

}
