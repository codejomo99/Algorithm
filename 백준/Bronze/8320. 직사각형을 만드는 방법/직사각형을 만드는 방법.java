import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int cnt = 0;
        for (int i = 1; i * i <= n; i++) {
            for (int j = i; j * i <= n; j++) {
                cnt++;
            }
        }

        System.out.println(cnt);

    }
}
