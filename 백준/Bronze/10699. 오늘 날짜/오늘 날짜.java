import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        // 현재 날짜를 가져옴
        LocalDate today = LocalDate.now();
        
        // 날짜 형식 지정
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        
        // 포맷된 날짜 출력
        System.out.println(today.format(formatter));
    }
}
