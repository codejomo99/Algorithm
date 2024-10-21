import java.util.Scanner;

class Solution {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int t = 1; t <= T; t++) {
            int n = sc.nextInt();
            int sum = 0;
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                sum += arr[i];
            }

            int avg = sum / n;

            int result = 0;
            for (int i = 0; i < n; i++) {
                result += Math.abs(arr[i] - avg);
            }

            System.out.println("#" + t + " " + result / 2);


        }

    }


}
