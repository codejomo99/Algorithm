import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result = 0;
        for (int i = 0; i < n; i++) {
            int length = 1;
            for (int j = i; j < n - 1; j++) {
                if (arr[j] <= arr[j + 1]) {
                    length++;
                } else {
                    break;
                }
            }
            result = Math.max(result, length);
        }

        for (int i = 0; i < n; i++) {
            int length = 1;
            for (int j = i; j < n - 1; j++) {
                if (arr[j] >= arr[j + 1]) {
                    length++;
                } else {
                    break;
                }
            }
            result = Math.max(result, length);
        }

        System.out.println(result);

    }


}
