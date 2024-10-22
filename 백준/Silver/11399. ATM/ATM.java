import java.util.Arrays;
import java.util.Scanner;

class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int sum = 0;
        int prev = 0;
        for (int i = 0; i < n; i++) {
            prev += arr[i];
            sum += prev;
        }

        System.out.println(sum);


    }
}
