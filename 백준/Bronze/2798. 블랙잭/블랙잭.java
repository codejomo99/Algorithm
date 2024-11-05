import java.util.Arrays;
import java.util.Scanner;

class Main {

    static int n, m, max;
    static int[] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        max = Integer.MIN_VALUE;
        dfs(0, 0, 0);

        System.out.println(max);

    }

    public static void dfs(int L, int idx, int sum) {
        if (L == 3) {
            if (sum <= m) {
                max = Math.max(max, sum);
            }
            return;
        }

        for (int i = idx; i < n; i++) {
            if (sum + arr[i] > m) {
                continue;
            }
            dfs(L + 1, i + 1, sum + arr[i]);
        }
    }
}
