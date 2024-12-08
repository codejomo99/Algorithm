import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 이전 순열 찾기
        if (prevPermutation(arr)) {
            for (int num : arr) {
                System.out.print(num + " ");
            }
        } else {
            System.out.println(-1);
        }
    }

    public static boolean prevPermutation(int[] arr) {
        int i = arr.length - 1;

        // 1. 감소하는 지점 찾기
        while (i > 0 && arr[i - 1] <= arr[i]) {
            i--;
        }

        if (i <= 0) {
            return false;
        }

        // 2. 교환할 값 찾기
        int j = arr.length - 1;
        while (arr[j] >= arr[i - 1]) {
            j--;
        }

        // 3. 값 교환
        int temp = arr[i - 1];
        arr[i - 1] = arr[j];
        arr[j] = temp;

        // 4. 뒤쪽 정렬
        j = arr.length - 1;
        while (i < j) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        return true;
    }
}
