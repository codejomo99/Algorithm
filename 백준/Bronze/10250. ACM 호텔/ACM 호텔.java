import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 테스트 케이스 수 입력
        int T = sc.nextInt();
        
        for (int i = 0; i < T; i++) {
            // H: 층 수, W: 방 수, N: 손님 번호 입력
            int H = sc.nextInt();
            int W = sc.nextInt();
            int N = sc.nextInt();
            
            // 방 배정 로직
            int floor = (N - 1) % H + 1; // 층수 계산 (1부터 시작)
            int roomNumber = (N - 1) / H + 1; // 방 번호 계산 (1부터 시작)
            
            // 방 번호 형식 YXX 또는 YYXX로 만들기
            String room = floor + String.format("%02d", roomNumber);
            
            // 결과 출력
            System.out.println(room);
        }
        
        sc.close();
    }
}
