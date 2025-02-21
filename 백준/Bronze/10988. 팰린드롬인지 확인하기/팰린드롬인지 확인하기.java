import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String str = br.readLine();
        
        if(pali(str)){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }
    public static boolean pali(String str){
        String reverse = new StringBuilder(str).reverse().toString();
        if(reverse.equals(str)){
            return true;
        }
        
        return false;
    }
}