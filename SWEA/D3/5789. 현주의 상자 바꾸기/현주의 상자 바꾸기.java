import java.util.Scanner;

class Solution {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int t = 1; t <= T; t++) {
            int n = sc.nextInt();
            int q = sc.nextInt();

            int[] arr = new int[n + 1];

            for (int i = 1; i <= q; i++) {
                int L = sc.nextInt();
                int R = sc.nextInt();

                for (int j = L; j <= R; j++) {
                    arr[j] = i;
                }
            }

            System.out.print("#" + t + " ");
            for (int i = 1; i <= n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

    }


}
