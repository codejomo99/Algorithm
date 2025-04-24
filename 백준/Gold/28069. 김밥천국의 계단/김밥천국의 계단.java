import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static int n, k;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();

        System.out.println(bfs() ? "minigimbob" : "water");
    }

    public static boolean bfs() {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(0);
        int[] cnt = new int[n + 1]; // 이동 횟수 기록
        while (!queue.isEmpty()) {
            int now = queue.poll();
            if (now == n && cnt[now] <= k) { // n번째 계단에 도착 & k번 이하로 도달 가능
                return true;
            }

            if (cnt[now] == k) { // 횟수 k번 모두 사용 → 탐색 멈춤
                continue;
            }

            int walk = now + 1;
            if (walk <= n && cnt[walk] == 0) { // n번째 계단 이하 & 아직 방문 X
                cnt[walk] = cnt[now] + 1;
                queue.offer(walk);
            }

            int jump = now + now / 2;
            if (jump <= n && cnt[jump] == 0) { // n번째 계단 이하 & 아직 방문 X
                cnt[jump] = cnt[now] + 1;
                queue.offer(jump);
            }
        }

        return false;
    }
}