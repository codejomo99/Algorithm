import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    // 윤년 때문에 각 월이 며칠인지 구하는 메서드
    public static int[] getYear(int year) {
        int[] month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            month[1] = 29;
        }
        return month;
    }

    // 월이 영어로 되어 있어서 숫자로 변환하는 메서드
    public static int getMonth(String month) {
        switch (month) {
            case "January": return 1;
            case "February": return 2;
            case "March": return 3;
            case "April": return 4;
            case "May": return 5;
            case "June": return 6;
            case "July": return 7;
            case "August": return 8;
            case "September": return 9;
            case "October": return 10;
            case "November": return 11;
            case "December": return 12;
            default: return 0;
        }
    }

    // 진행된 날짜 구하기
    public static int getDays(int[] months, int month, int day) {
        int Days = 0;
        for (int i = 0; i < month - 1; i++) {
            Days += months[i];
        }
        Days += day - 1;
        return Days;
    }

    // 날짜를 시간으로 변환하는 메서드
    public static int getTime(int day, int hour, int minute) {
        return (1440 * day) + (60 * hour) + minute;
    }

    // 해당하는 년도의 총 시간을 계산하는 메서드
    public static int getDTime(int[] months) {
        int totalDays = 0;
        for (int days : months) {
            totalDays += days;
        }
        return totalDays * 1440;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력값 처리
        String[] inputAnswer = br.readLine().split(" ");
        int month = getMonth(inputAnswer[0]);
        int[] months = getYear(Integer.parseInt(inputAnswer[2]));
        int day = Integer.parseInt(inputAnswer[1].substring(0, 2));
        int tDay = getDays(months, month, day);
        int hour = Integer.parseInt(inputAnswer[3].substring(0, 2));
        int minute = Integer.parseInt(inputAnswer[3].substring(3, 5));

        // 시간 계산
        int tTime = getTime(tDay, hour, minute);
        int dTime = getDTime(months);

        // 결과 계산
        double result = (double) tTime / dTime * 100;

        // 결과 출력
        System.out.println(result);
    }
}