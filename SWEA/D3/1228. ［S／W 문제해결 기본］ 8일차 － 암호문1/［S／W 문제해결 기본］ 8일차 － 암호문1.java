import java.util.LinkedList;
import java.util.Scanner;

class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int t = 1; t <= 10; t++) {
            int N = sc.nextInt(); // 원본 암호문 길이
            LinkedList<Integer> list = new LinkedList<>();

            for (int i = 0; i < N; i++) {
                list.add(sc.nextInt()); // 원본 암호문 입력
            }

            int K = sc.nextInt(); // 명령어 개수

            for (int q = 0; q < K; q++) {
                String command = sc.next(); // 명령어 (I)
                int x = sc.nextInt(); // 위치
                int y = sc.nextInt(); // 삽입할 숫자의 개수

                // y개의 숫자를 삽입
                for (int i = 0; i < y; i++) {
                    list.add(x + i, sc.nextInt()); // x 다음에 삽입
                }
            }

            // 결과 출력
            System.out.printf("#%d ", t);
            for (int i = 0; i < Math.min(10, list.size()); i++) { // 처음 10개 출력
                System.out.print(list.get(i) + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}