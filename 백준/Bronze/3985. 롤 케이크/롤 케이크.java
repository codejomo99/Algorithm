import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int L = sc.nextInt();
        int[] arr = new int[L + 1];
        int n = sc.nextInt();

        int max = 0;
        int maxIdx = 0;
        int maxSum = 0;
        int people2 = 0;

        for (int i = 1; i <= n; i++) {
            int p = sc.nextInt();
            int k = sc.nextInt();

            int minus = k - p;
            int sum = 0;

            if (max < minus) {
                max = minus;
                maxIdx = i;
            }

            for (int j = p; j <= k; j++) {
                if (arr[j] == 0) {
                    arr[j] = i;
                    sum++;
                }
            }

            if (sum > maxSum) {
                maxSum = sum;
                people2 = i;
            }
        }

        System.out.println(maxIdx);
        System.out.println(people2);


    }
}
