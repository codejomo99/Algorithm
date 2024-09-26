import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String ca = sc.next();
        String cb = sc.next();
        String cc = sc.next();

        // 첫 번째 문자열과 두 번째 문자열을 정수로 변환
        int a = Integer.parseInt(ca);
        int b = Integer.parseInt(cb);
        int c = Integer.parseInt(cc);

        // a + b - c 결과 출력
        System.out.println(a + b - c);

        // ca + cb를 정수로 변환한 후 cc를 정수로 변환하여 두 값을 빼는 결과 출력
        int result = Integer.parseInt(ca + cb) - c; // cc 대신 c 사용
        System.out.println(result);

        sc.close();
    }
}
