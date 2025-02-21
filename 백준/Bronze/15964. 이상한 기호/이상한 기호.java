import java.io.*;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력: A와 B를 한 줄에 공백으로 구분하여 입력
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        // A＠B 계산 및 출력
        System.out.println(calculate(A, B));
    }

    // A＠B = (A + B) × (A - B) 로 정의된 연산
    public static long calculate(int A, int B) {
        return (long)(A + B) * (A - B);
    }
}