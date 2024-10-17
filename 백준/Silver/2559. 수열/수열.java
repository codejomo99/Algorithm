import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];

        arr[0] = sc.nextInt();

        // 누적합
        for (int i = 1; i < n; i++) {
            arr[i] = arr[i - 1] + sc.nextInt();
        }
        

        // 누적합의 최대
        int max = arr[m - 1];

        for (int i = m; i < n; i++) {
            int num = arr[i] - arr[i - m];
            max = Math.max(max, num);
        }

        System.out.println(max);

    }
}
