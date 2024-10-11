import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력받기
        int Br = sc.nextInt();
        int Bc = sc.nextInt();
        int Dr = sc.nextInt();
        int Dc = sc.nextInt();
        int Jr = sc.nextInt();
        int Jc = sc.nextInt();

        // 베시의 이동 시간 (체스판 거리)
        int bessieTime = Math.max(Math.abs(Br - Jr), Math.abs(Bc - Jc));

        // 데이지의 이동 시간 (맨해튼 거리)
        int daisyTime = Math.abs(Dr - Jr) + Math.abs(Dc - Jc);

        // 결과 출력
        if (bessieTime < daisyTime) {
            System.out.println("bessie");
        } else if (daisyTime < bessieTime) {
            System.out.println("daisy");
        } else {
            System.out.println("tie");
        }

        sc.close();
    }
}