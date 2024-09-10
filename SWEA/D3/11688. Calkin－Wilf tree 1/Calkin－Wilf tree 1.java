import java.util.Scanner;

class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine(); 

        for (int t = 1; t <= T; t++) {
            String d = sc.nextLine();
            System.out.println("#"+t+" "+find(d));
        }
    }

    private static String find(String d) {
        int num = 1;
        int den = 1;

        for (char c : d.toCharArray()) {
            if (c == 'L') {
                den = num + den;
            } else if (c == 'R') {
                num = num + den;
            }
        }

        return num + " " + den;
    }
}
