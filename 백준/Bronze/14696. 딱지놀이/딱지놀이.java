import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int t = 0; t < T; t++) {

            int a = sc.nextInt();
            int[] ar = new int[a];
            for (int i = 0; i < a; i++) {
                ar[i] = sc.nextInt();
            }

            int b = sc.nextInt();
            int[] br = new int[b];
            for (int i = 0; i < b; i++) {
                br[i] = sc.nextInt();
            }

            battle(ar, br);

        }

    }

    public static void battle(int[] a, int[] b) {
        int[] checkA = new int[5];
        int[] checkB = new int[5];

        for (int i : a) {
            checkA[i]++;
        }

        for (int i : b) {
            checkB[i]++;
        }

        for (int i = 4; i >= 1; i--) {
            if (checkA[i] > checkB[i]) {
                System.out.println("A");
                return;
            } else if (checkB[i] > checkA[i]) {
                System.out.println("B");
                return;
            }
        }

        System.out.println("D");
    }


}
