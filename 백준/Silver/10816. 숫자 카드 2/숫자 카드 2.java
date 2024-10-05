import java.io.*;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // n 배열 입력
        int n = Integer.parseInt(br.readLine());
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        String[] arrN = br.readLine().split(" ");

        // n개의 숫자를 입력받아 빈도를 저장
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(arrN[i]);
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // m 배열 입력
        int m = Integer.parseInt(br.readLine());
        String[] arrM = br.readLine().split(" ");

        // m 배열의 각 숫자에 대해 n 배열에서의 빈도 출력
        for (int i = 0; i < m; i++) {
            int num = Integer.parseInt(arrM[i]);
            int cnt = freqMap.getOrDefault(num, 0);
            bw.write(cnt + " ");
        }

        bw.flush();  // 출력 버퍼 비우기
        bw.close();
        br.close();
    }
}
