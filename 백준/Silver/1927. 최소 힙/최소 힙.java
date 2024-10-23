import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int t = 0; t < T; t++) {
            int n = sc.nextInt();
            if (n == 0) {
                if (pq.isEmpty()) {
                    System.out.println(0);
                } else {
                    System.out.println(pq.poll());
                }
            } else {
                pq.add(n);
            }
        }

    }
}
