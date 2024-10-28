import java.util.Scanner;

class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int t = 1; t <= T; t++) {
            int n = sc.nextInt();
            int mid = n / 2;

            int[][] arr = new int[n][n];

            for (int i = 0; i < n; i++) {
                String s = sc.next();
                for (int j = 0; j < n; j++) {
                    int num = s.charAt(j) - '0';

                    arr[i][j] = num;
                }
            }

            int result = 0;

            // mid 기준으로 위로
            int left = 0, right = 0;

            for (int i = mid; i >= 0; i--) {

                for (int j = left; j < n - right; j++) {
                    result += arr[i][j];
                }

                left++;
                right++;
            }

            // mid 기준으로 아래로
            left = 0;
            right = 0;

            for (int i = mid; i < n; i++) {

                for (int j = left; j < n - right; j++) {
                    result += arr[i][j];
                }

                left++;
                right++;
            }

            for (int i = 0; i < n; i++) {
                result -= arr[mid][i];
            }

            System.out.println("#" + t + " " + result);


        }


    }


}
