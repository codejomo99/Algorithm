import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[N];

        int max = 0;
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
            max = Math.max(max, arr[i]);
        }

        int left = 0;
        int right = max;
        int result = 0;

        while (left <= right) {
            int mid = (left + right) / 2;
            long total = 0;

            for (int j = 0; j < N; j++) {
                if (arr[j] > mid) {
                    total += arr[j] - mid;
                }
            }

            if (total >= M) {
                result = mid; // 높이를 기록하고 더 높은 값도 시도
                left = mid + 1;
            } else {
                right = mid - 1; // 잘린 나무의 길이가 부족하므로 높이 줄임
            }
        }

        System.out.println(result);
        sc.close();
    }
}