import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int L = sc.nextInt();  // 케이크의 길이
        int n = sc.nextInt();  // 사람 수
        int[] arr = new int[L + 1];  // 케이크 배열 (누가 가져갔는지 기록)

        int max = 0;
        int maxIdx = 0;  // 가장 많이 예상한 사람의 번호

        // 각 사람의 예상 케이크 범위를 입력
        for (int i = 1; i <= n; i++) {
            int p = sc.nextInt();
            int k = sc.nextInt();

            // 예상한 케이크 범위의 길이
            int length = k - p + 1;

            // 가장 많이 예상한 사람을 저장
            if (length > max) {
                max = length;
                maxIdx = i;
            }

            // 실제로 케이크를 가져가는 과정
            for (int j = p; j <= k; j++) {
                if (arr[j] == 0) {  // 케이크가 아직 안 가져갔다면
                    arr[j] = i;  // i번 사람이 케이크 가져감
                }
            }
        }

        // 각 사람이 실제로 받은 케이크 조각 수를 세기 위한 배열
        int[] check = new int[n + 1];
        for (int i = 1; i <= L; i++) {
            if (arr[i] != 0) {  // 케이크를 누군가 가져갔다면
                check[arr[i]]++;
            }
        }

        // 가장 많이 받은 사람 찾기
        int maxRealIdx = 1;
        for (int i = 2; i <= n; i++) {
            if (check[i] > check[maxRealIdx]) {
                maxRealIdx = i;
            }
        }

        // 결과 출력
        System.out.println(maxIdx);  // 가장 많이 예상한 사람
        System.out.println(maxRealIdx);  // 실제로 가장 많이 받은 사람
    }
}