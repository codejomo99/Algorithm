import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int tmp = 0;

        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            tmp = n % m;
            if (tmp >= 10) {
                char c = (char) (tmp + 55);
                sb.append(c);
            } else {
                sb.append(tmp);
            }
            n = n / m;
        }

        String result = new StringBuilder(sb).reverse().toString();

        System.out.println(result);

    }
}
