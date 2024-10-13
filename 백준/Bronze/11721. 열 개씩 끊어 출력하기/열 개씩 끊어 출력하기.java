import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String s = sc.nextLine();
    int len = s.length();

    for(int i = 0; i < len; i+=10){
      if(i + 10 < len){
        System.out.println(s.substring(i,i+10));
      }else{
        System.out.println(s.substring(i));
      }
    }

  }

}
