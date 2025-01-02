import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine()); // 테스트 케이스 수

        for (int t = 0; t < T; t++) {
            int N = Integer.parseInt(br.readLine()); // 하루에 배달되는 사료의 양

            int[] arr = new int[6]; // 돼지 6마리의 첫날 요구량
            StringTokenizer st = new StringTokenizer(br.readLine());

            int total = 0;
            for (int i = 0; i < 6; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
                total += arr[i];
            }

            // 첫 번째 날에 이미 사료량 초과
            if (total > N) {
                System.out.println(1);
                continue;
            }

            int day = 1;
            while (true) {
                day++;
                total = pigFood(arr); // 새로운 요구량 계산

                if (total > N) {
                    System.out.println(day);
                    break;
                }
            }
        }
    }

    public static int pigFood(int[] arr) {
        int[] newArr = new int[6]; // 새 배열을 사용해 동시 갱신
        int sum = 0;

        for (int i = 0; i < 6; i++) {
            int pair = (i + 3) % 6; // 맞은편 돼지
            int prevIdx = (i + 5) % 6; // 왼쪽 돼지
            int nextIdx = (i + 1) % 6; // 오른쪽 돼지

            // 새로운 배열에 요구량 계산
            newArr[i] = arr[i] + arr[pair] + arr[prevIdx] + arr[nextIdx];
            sum += newArr[i];
        }

        // 계산이 끝난 후 arr을 업데이트
        for (int i = 0; i < 6; i++) {
            arr[i] = newArr[i];
        }

        return sum; // 전체 요구량 합 반환
    }
}