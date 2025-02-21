import java.io.*;
import java.util.*;

class Main{

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        StringBuilder sb = new StringBuilder();
        for(char ch : str.toCharArray()){
            if(Character.isUpperCase(ch)){
                sb.append(String.valueOf(ch).toLowerCase());
            }else{
                sb.append(String.valueOf(ch).toUpperCase());
            }
        }

        System.out.println(sb);


    }

}