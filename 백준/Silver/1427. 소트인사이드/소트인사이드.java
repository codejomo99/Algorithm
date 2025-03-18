import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

class Main{

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        Integer[] arr = new Integer[str.length()];

        for(int i = 0; i < arr.length; i++){
            arr[i] = str.charAt(i) - '0';
        }

        Arrays.sort(arr, Collections.reverseOrder());

        for(int num : arr){
            System.out.print(num);
        }
    }
}