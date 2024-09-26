import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

  public static void main(String[] args) throws IOException {
    // BufferedReader 사용
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // 첫 번째 입력: 배열의 크기
    int n = Integer.parseInt(br.readLine());
    int[] arr = new int[n];

    // 입력값 한 줄로 받기 위해 StringTokenizer 사용
    StringTokenizer st = new StringTokenizer(br.readLine());

    for (int i = 0; i < n; i++) {
      arr[i] = Integer.parseInt(st.nextToken());
    }

    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;

    for (int i : arr) {
      min = Math.min(min, i);
      max = Math.max(max, i);
    }

    // 결과 출력
    System.out.println(min + " " + max);
  }
}
