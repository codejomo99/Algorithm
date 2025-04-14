import java.util.*;
import java.io.*;

public class Main {
    static int M, N;
    static int[] snacks;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 조카 수(M), 과자 수(N)
        StringTokenizer st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());

        // 과자 길이 입력
        snacks = new int[N];
        st = new StringTokenizer(br.readLine());
        int maxLen = 0;
        for (int i = 0; i < N; i++) {
            snacks[i] = Integer.parseInt(st.nextToken());
            maxLen = Math.max(maxLen, snacks[i]);  // 최대 과자 길이 저장
        }

        // 이진 탐색 시작
        int left = 1;
        int right = maxLen;
        int result = 0;

        while (left <= right) {
            int mid = (left + right) / 2;  // 조카 1명에게 줄 막대 과자의 후보 길이

            if (canDivide(mid)) {
                result = mid;        // 가능한 길이 중 최댓값 저장
                left = mid + 1;      // 더 긴 과자로 도전
            } else {
                right = mid - 1;     // 과자가 부족하니 길이를 줄인다
            }
        }

        System.out.println(result);
    }

    // mid 길이로 M명에게 줄 수 있는지 확인
    public static boolean canDivide(int length) {
        long count = 0;
        for (int snack : snacks) {
            count += snack / length;
        }
        return count >= M;
    }
}