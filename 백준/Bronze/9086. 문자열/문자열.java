import java.io.*;
import java.util.*;

class Main{

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++){
            String str = br.readLine();
            StringBuilder sb = new StringBuilder();

            sb.append(str.charAt(0)).append(str.charAt(str.length()-1));

            System.out.println(sb);
        }



    }

}