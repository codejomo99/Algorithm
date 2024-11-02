import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t = 0; t < T; t++) {
            int n = sc.nextInt();

            Map<String, Integer> map = new HashMap<>();

            for (int i = 0; i < n; i++) {
                String s1 = sc.next();
                String c = sc.next();

                map.put(c, map.getOrDefault(c, 0) + 1);
            }

            int result = 1;

            for(int i : map.values()){
                result *= (i+1);
            }

            System.out.println(result-1);
        }
    }


}
