import java.util.Arrays;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[9];

        int sum = 0;
        for (int i = 0; i < 9; i++) {
            int n = sc.nextInt();
            arr[i] = n;
            sum += arr[i];
        }

        Arrays.sort(arr);

        int a = 0, b = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (sum - arr[j] - arr[i] == 100) {
                    a = i;
                    b = j;
                    break;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (i != a && i != b) {
                System.out.println(arr[i]);
            }
        }


    }
}
