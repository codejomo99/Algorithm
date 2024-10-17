import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int t = 1; t <= T; t++) {
            int n = sc.nextInt();
            int[] arr = new int[20];

            for (int i = 0; i < 20; i++) {
                arr[i] = sc.nextInt();
            }

            int cnt = 0;

            for (int i = 0; i < 20; i++) {
                for (int j = i + 1; j < 20; j++) {
                    if (arr[i] > arr[j]) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                        cnt++;
                    }
                }
            }

            System.out.println(n + " " + cnt);


        }
    }
}
