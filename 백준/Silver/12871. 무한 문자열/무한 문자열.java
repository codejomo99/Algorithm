import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str1 = br.readLine();
        String str2 = br.readLine();

        int len1 = str1.length();
        int len2 = str2.length();

        int lcm = (len1 * len2) / gcd(len1, len2);

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        while (sb1.length() < lcm) {
            sb1.append(str1);
        }

        while (sb2.length() < lcm) {
            sb2.append(str2);
        }

        if (sb1.toString().equals(sb2.toString())) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

    }

    public static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }


}
