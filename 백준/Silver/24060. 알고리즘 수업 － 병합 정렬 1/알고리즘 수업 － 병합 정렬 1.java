import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int[] tempArray; // 병합 과정에서 사용할 임시 배열
    static int result = -1; // K번째 저장되는 값을 저장
    static int saveCount = 0; // 저장 횟수를 누적
    static int K; // 목표 저장 횟수 K

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력 받기
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 배열 크기
        K = Integer.parseInt(st.nextToken()); // K번째 저장 횟수

        int[] array = new int[N]; // 정렬할 배열
        tempArray = new int[N]; // 병합 정렬에 필요한 임시 배열

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }

        // 병합 정렬 수행
        mergeSort(array, 0, N - 1);

        // 결과 출력
        System.out.println(result);
    }

    // 병합 정렬 알고리즘
    static void mergeSort(int[] array, int start, int end) {
        // 배열을 분할하여 정렬
        if (start < end) {
            int mid = (start + end) / 2;

            // 왼쪽 절반 정렬
            mergeSort(array, start, mid);
            // 오른쪽 절반 정렬
            mergeSort(array, mid + 1, end);
            // 병합 과정
            merge(array, start, mid, end);
        }
    }

    // 병합 과정
    static void merge(int[] array, int start, int mid, int end) {
        int leftIndex = start;    // 왼쪽 배열의 시작점
        int rightIndex = mid + 1; // 오른쪽 배열의 시작점
        int tempIndex = 0;        // 임시 배열의 인덱스

        // 두 부분 배열을 병합하여 정렬
        while (leftIndex <= mid && rightIndex <= end) {
            if (array[leftIndex] <= array[rightIndex]) {
                tempArray[tempIndex++] = array[leftIndex++];
            } else {
                tempArray[tempIndex++] = array[rightIndex++];
            }
        }

        // 왼쪽 부분에 남아있는 값 복사
        while (leftIndex <= mid) {
            tempArray[tempIndex++] = array[leftIndex++];
        }

        // 오른쪽 부분에 남아있는 값 복사
        while (rightIndex <= end) {
            tempArray[tempIndex++] = array[rightIndex++];
        }

        // 정렬된 값을 원본 배열에 복사하며 저장 횟수 추적
        tempIndex = 0;
        for (int i = start; i <= end; i++) {
            saveCount++;
            if (saveCount == K) {
                result = tempArray[tempIndex]; // K번째 저장되는 값 저장
            }
            array[i] = tempArray[tempIndex++];
        }
    }
}