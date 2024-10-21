import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

class Solution {
    static int n;
    static int[] arr;
    static HashSet<Integer> list;

    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int t = 1; t <= T; t++) {
            n = 7;
            arr = new int[7];

            for (int i = 0; i < 7; i++) {
                arr[i] = sc.nextInt();
            }

            list = new HashSet<>();

            dfs(0, 0, 0);

            Object[] newArrays = list.toArray();
            Arrays.sort(newArrays);

            System.out.println("#" + t + " " + newArrays[list.size() - 5]);
        }
    }

    public static void dfs(int L, int idx, int sum) {
        if (idx == arr.length) {
            if (L == 3) {
                list.add(sum);
            }
            return;
        }

        dfs(L + 1, idx + 1, sum + arr[idx]);
        dfs(L, idx + 1, sum);

    }


}
