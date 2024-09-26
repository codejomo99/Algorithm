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

    for (int i = 0; i < n; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());

      // 첫번째 숫자
      int number = Integer.parseInt(st.nextToken());

      // 두번째 문자열
      String str = st.nextToken();

      for (char c : str.toCharArray()) {
        for(int j = 0; j < number; j++){
          System.out.print(c);
        }
      }
      System.out.println();
    }


  }
}
