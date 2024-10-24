import java.util.HashMap;
import java.util.Scanner;

class Main {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] fruits = new int[n];

        for (int i = 0; i < n; i++) {
            fruits[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        int left = 0;
        int length = 0;

        for (int right = 0; right < n; right++) {
            map.put(fruits[right], map.getOrDefault(fruits[right], 0) + 1);

            while (map.size() > 2) {
                map.put(fruits[left], map.get(fruits[left]) - 1);

                if (map.get(fruits[left]) == 0) {
                    map.remove(fruits[left]);
                }

                left++;
            }
            length = Math.max(length, (right - left) + 1);
        }

        System.out.println(length);


    }


}
