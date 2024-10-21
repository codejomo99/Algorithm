import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Solution {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int t = 1; t <= T; t++) {
            StringBuilder sb = new StringBuilder();

            String s = sc.next();
            sb.append(s);

            int n = sc.nextInt();
            ArrayList<Integer> inserts = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                int inset = sc.nextInt();
                inserts.add(inset);
            }

            Collections.sort(inserts, Collections.reverseOrder());

            for (int inset : inserts) {
                sb.insert(inset, "-");
            }

            System.out.printf("#" + t + " ");
            System.out.println(sb.toString());


        }

    }


}
