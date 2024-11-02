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

        int num = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            num += arr[i];
            sum += num;

        }

        System.out.println(sum);
    }


}
