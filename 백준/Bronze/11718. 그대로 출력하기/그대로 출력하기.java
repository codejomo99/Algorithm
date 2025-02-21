import java.io.*;

public class Main {
  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    String a;

    // br.readLine() 결과를 먼저 a에 저장하고 null 체크
    while ((a = br.readLine()) != null) {
      bw.write(a + "\n");
    }
    bw.flush();
  }
}