import java.util.Scanner;

class Main {

    static int max = -1, N;
    static int[][] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        arr = new int[N][6];

        // N개의 주사위 정보를 저장
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // 1번째 주사위 상태에 따른 재귀 탐색 진행
        for (int i = 0; i < 6; i++) {
            search(1, i, 0);
        }

        System.out.println(max);
        sc.close();

    }

    // 주사위를 순차적으로 쌓는 재귀 함수
    static void search(int cnt, int bottom, int sum) {
        // 아랫면을 마주 보는 면
        int pair = pairCheck(bottom);
        int tempMax = -1;

        // 옆면의 최댓값 구하기
        for (int i = 0; i < 6; i++) {
            if (i == pair || i == bottom) {
                continue;
            }
            tempMax = Math.max(tempMax, arr[cnt - 1][i]);
        }
        sum += tempMax;

        // 주사위를 모두 다 쌓았을때
        if (cnt == N) {
            max = Math.max(max, sum);
            return;
        }

        // 다음 주사위 쌓기 진행
        for (int i = 0; i < 6; i++) {
            if (arr[cnt - 1][pair] == arr[cnt][i]) {
                search(cnt + 1, i, sum);
                break;
            }
        }
    }

    // 마주보는 면 인덱스 구하는 함수
    static int pairCheck(int n) {
        if (n == 0) {
            return 5;
        } else if (n == 1) {
            return 3;
        } else if (n == 2) {
            return 4;
        } else if (n == 3) {
            return 1;
        } else if (n == 4) {
            return 2;
        } else {
            return 0;
        }
    }
}
