import java.util.Scanner;

public class Main {


  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    for(int i = 0; i < 4; i++){
      // 첫 번째 직사각형
      int x1 = sc.nextInt();
      int y1 = sc.nextInt();
      int p1 = sc.nextInt();
      int q1 = sc.nextInt();

      // 두 번째 직사각형
      int x2 = sc.nextInt();
      int y2 = sc.nextInt();
      int p2 = sc.nextInt();
      int q2 = sc.nextInt();

      if(p1 < x2 || q1 < y2 || x1 > p2 || y1 > q2){
        System.out.println("d");
      }else if((p1 == x2 && q1 == y2) || (x1 == p2 && y1 == q2) || (p1 == x2 && y1 == q2) || (x1 == p2 && q1 == y2)) {
        System.out.println("c");
      }else if(y1 == q2 || p1 == x2 || q1 == y2 || x1 == p2){
        System.out.println("b");
      }else{
        System.out.println("a");
      }
    }


  }
}
