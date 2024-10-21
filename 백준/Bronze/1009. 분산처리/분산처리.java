import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int t = 1; t <= T; t++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            int num = 1;
            for (int i = 0; i < b; i++) {
                num = (num * a) % 10;
            }

            if (num == 0) {
                System.out.println("10");
            } else {
                System.out.println(num);
            }
        }

    }
}
