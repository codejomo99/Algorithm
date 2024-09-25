import java.time.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();  // 테스트 케이스 수 입력

        for (int tc = 1; tc <= T; tc++) {
            int month = sc.nextInt();  // 월 입력
            int day = sc.nextInt();    // 일 입력

            // 2016년 기준 날짜 생성
            LocalDate date = LocalDate.of(2016, month, day);

            // 요일을 구함 (0: 월요일, 1: 화요일, ..., 6: 일요일)
            DayOfWeek dayOfWeek = date.getDayOfWeek();
            int dayNumber = (dayOfWeek.getValue() - 1);  // 월요일을 0으로 조정

            // 결과 출력
            System.out.println("#" + tc + " " + dayNumber);
        }

        sc.close();
    }
}
