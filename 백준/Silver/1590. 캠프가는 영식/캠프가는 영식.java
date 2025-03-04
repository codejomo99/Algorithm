import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력 받기
        int N = sc.nextInt();  // 버스 개수
        int T = sc.nextInt();  // 영식이 도착 시간

        int minWaitTime = Integer.MAX_VALUE;  // 최소 대기 시간 (최대값으로 초기화)

        for (int i = 0; i < N; i++) {
            int Si = sc.nextInt();  // 시작 시간
            int Ii = sc.nextInt();  // 간격
            int Ci = sc.nextInt();  // 대수

            // 버스 출발 시간 계산
            for (int j = 0; j < Ci; j++) {
                int departureTime = Si + (Ii * j);  // 버스 j번째 출발 시간
                
                if (departureTime >= T) {  // 영식이가 탈 수 있는 가장 빠른 버스 찾기
                    minWaitTime = Math.min(minWaitTime, departureTime - T);
                    break; // 더 이상 확인할 필요 없음 (최소 출발 시간 찾으면 break)
                }
            }
        }

        // 결과 출력
        System.out.println(minWaitTime == Integer.MAX_VALUE ? -1 : minWaitTime);
    }
}