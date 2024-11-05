import java.util.*;
import java.io.*;

public class Main {


  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int L = sc.nextInt();

    int pos = 0;
    int time = 0;

    for(int i = 0; i < N; i++) {
      int D = sc.nextInt();
      int R = sc.nextInt();
      int G = sc.nextInt();

      time += D - pos;
      pos = D;

      if(time % (R+G) < R){
        time += R - (time % (R+G));
      }
    }

    time += L - pos;

    System.out.println(time);



  }
}
