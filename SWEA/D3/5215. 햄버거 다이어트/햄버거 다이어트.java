import java.util.Scanner;


class Solution {
    static int n, k;
    static int[][] items;
    static int max;

    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int t = 1; t <= T; t++) {
            n = sc.nextInt();
            k = sc.nextInt();

            items = new int[n][2];
            for (int i = 0; i < n; i++) {
                items[i][0] = sc.nextInt();
                items[i][1] = sc.nextInt();
            }

            max = 0;

            dfs(0, 0, 0);
            System.out.println("#"+t+" "+max);


        }
    }

    public static void dfs(int L, int score, int cal) {

        // 모든 물건을 확인 하면 재귀 종료
        if (L == n) {
            max = Math.max(max, score);
            return;
        }

        // 물건을 포함할 수 있는 경우 재귀 진행.
        if (cal + items[L][1] <= k) {
            dfs(L + 1, score + items[L][0], cal + items[L][1]);
        }

        // 물건을 포함하지 않고 재귀 진행
        if (cal <= k) {
            dfs(L + 1, score, cal);
        }

    }

}


