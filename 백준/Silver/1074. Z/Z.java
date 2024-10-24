import java.util.Scanner;

public class Main {

    static int N, R, C, ans = 0;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        R = sc.nextInt();
        C = sc.nextInt();

        zOrder(0, 0, (int) Math.pow(2, N));
    }

    public static void zOrder(int r, int c, int size) {
        if (size == 1) {
            System.out.println(ans);
            return;
        }
        int newSize = size / 2;
        if (R < r + newSize && C < c + newSize) {
            zOrder(r, c, newSize);
        }
        if (R < r + newSize && c + newSize <= C) {
            ans += (size * size) / 4;
            zOrder(r, c + newSize, newSize);
        }
        if (r + newSize <= R && C < c + newSize) {
            ans += ((size * size) / 4) * 2;
            zOrder(r + newSize, c, newSize);
        }
        if (r + newSize <= R && c + newSize <= C) {
            ans += ((size * size) / 4) * 3;
            zOrder(r + newSize, c + newSize, newSize);
        }
    }
}
