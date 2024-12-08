import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {

    int[] A;
    static int[] tmp; // 정렬 후 저장 배열
    static int result = -1;
    static int cnt = 0; // 저장 횟수 누적 저장
    static int K; // 저장 횟수

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 배열 크기
        K = Integer.parseInt(st.nextToken()); // 저장 횟수

        int[] A = new int[N]; // 배열 초기화
        tmp = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        merge_sort(A, 0, N - 1);

        System.out.println(result);

    }

    // 오름차순 정렬 메서드
    static void merge_sort(int[] A, int p, int r) {
        if (cnt > K) {
            return; // 저장 횟수보다 진행 횟수가 많아지면 더이상 진행 ㄴㄴ
        }
        if (p < r) {
            int q = (p + r) / 2;
            merge_sort(A, p, q); // 중간에서 왼쪽
            merge_sort(A, q + 1, r); // 중간에서 오른쪽
            merge(A, p, q, r); // 병합
        }
    }

    static void merge(int[] arr, int p, int q, int r) {
        // arr 배열, p : 시작점, q : 중간지점, r : 마지막점
        int i = p;
        int j = q + 1;
        int t = 0;

        // 시작 인덱스가 중간 인덱스보다 작고, 중간 인덱스가 마지막 인덱스보다 작을 경우 반복
        while (i <= q && j <= r) {
            if (arr[i] < arr[j]) {
                tmp[t++] = arr[i++];
            } else {
                tmp[t++] = arr[j++];
            }
        }

        // 다 정렬하고 남은 경우
        while (i <= q) {
            tmp[t++] = arr[i++];
        }

        while (j <= r) {
            tmp[t++] = arr[j++];
        }

        i = p;
        t = 0;

        while (i <= r) {
            cnt++;

            if (cnt == K) {
                result = tmp[t];
                break;
            }

            arr[i++] = tmp[t++];
        }
    }
}
