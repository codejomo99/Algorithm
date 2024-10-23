import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        // 남자
        Map<Integer, Integer> map1 = new HashMap<>();

        // 여자
        Map<Integer, Integer> map2 = new HashMap<>();

        for (int i = 0; i < N; i++) {
            int S = sc.nextInt();
            int Y = sc.nextInt();

            if (S == 1) {
                map1.put(Y, map1.getOrDefault(Y, 0) + 1);
            } else {
                map2.put(Y, map2.getOrDefault(Y, 0) + 1);
            }
        }

        int result = 0;
        for (int i : map1.values()) {
            if (i % 2 == 0) {
                result += i / 2;
            } else {
                result += (i / 2) + 1;
            }
        }
        for (int i : map2.values()) {
            if (i % 2 == 0) {
                result += i / 2;
            } else {
                result += (i / 2) + 1;
            }
        }

        System.out.println(result);
    }


}
