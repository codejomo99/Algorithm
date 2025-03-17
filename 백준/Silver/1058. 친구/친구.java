import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

    static int N;
    static int[][] board;
    static boolean[] visit;
    static int answer = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        board = new int[N][N];

        for (int i = 0; i < N; i++) {
            String line = br.readLine(); // 한 줄을 통째로 읽음
            for (int j = 0; j < N; j++) {
                if (line.charAt(j) == 'Y') {
                    board[i][j] = 1; // 친구 관계 설정
                }
            }
        }


        int maxFriends = 0;

        // 각 사람마다 2-친구 개수 계산
        for (int i = 0; i < N; i++) {
            boolean[] friendSet = new boolean[N]; // 2-친구 저장 배열
            int friendCount = 0;

            // 1. 직접 친구 찾기
            for (int j = 0; j < N; j++) {
                if (board[i][j] == 1) {
                    friendSet[j] = true;
                }
            }

            // 2. 한 다리 건너 친구 찾기
            for (int j = 0; j < N; j++) {
                if (board[i][j] == 1) { // i와 j가 직접 친구라면
                    for (int k = 0; k < N; k++) {
                        if (board[j][k] == 1) { // j와 k가 친구라면
                            friendSet[k] = true; // i의 2-친구로 추가
                        }
                    }
                }
            }

            // 3. 자기 자신 제외하고 카운트
            for (int j = 0; j < N; j++) {
                if (friendSet[j] && i != j) {
                    friendCount++;
                }
            }

            // 4. 최댓값 갱신
            maxFriends = Math.max(maxFriends, friendCount);
        }

        System.out.println(maxFriends);

    }


}