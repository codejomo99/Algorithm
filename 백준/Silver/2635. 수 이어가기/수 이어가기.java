import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        List<Integer> arr = new ArrayList<>();
        List<Integer> answer = new ArrayList<>();

        int k = 0;
        int max = 0;
        for (int i = n / 2; i <= n; i++) {
            int idx = 0;
            arr.add(n);
            arr.add(i);

            while (true) {
                k = arr.get(idx) - arr.get(idx + 1);
                if (k < 0) {
                    break;
                } else {
                    arr.add(k);
                    idx++;
                }
            }

            if (arr.size() > max) {
                answer.clear();
                max = arr.size();
                answer.addAll(arr);
            }

            arr.clear();
            
        }

        System.out.println(max);
        for (int i = 0; i < answer.size(); i++) {
            System.out.print(answer.get(i) + " ");
        }

    }


}
