import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()); // 테스트 케이스 수

        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine()); // 후보자 수
            int[] votes = new int[N];
            int totalVotes = 0;

            // 득표 수 입력
            for (int i = 0; i < N; i++) {
                votes[i] = Integer.parseInt(br.readLine());
                totalVotes += votes[i]; // 전체 투표 수 계산
            }

            // 최다 득표자 찾기
            int maxVotes = 0, maxIdx = -1, maxCount = 0;
            for (int i = 0; i < N; i++) {
                if (votes[i] > maxVotes) {
                    maxVotes = votes[i];
                    maxIdx = i; // 최다 득표자의 인덱스
                    maxCount = 1; // 최다 득표자 수 초기화
                } else if (votes[i] == maxVotes) {
                    maxCount++; // 최다 득표자가 여러 명일 경우
                }
            }

            // 최다 득표자가 여러 명인 경우
            if (maxCount > 1) {
                System.out.println("no winner");
                continue;
            }

            // 과반수 여부 판단
            if (maxVotes > totalVotes / 2) {
                System.out.printf("majority winner %d\n", maxIdx + 1); // 1-based index
            } else {
                System.out.printf("minority winner %d\n", maxIdx + 1); // 1-based index
            }
        }
    }
}