import java.util.Scanner;
 
class Solution {
    public static void main(String args[]) throws Exception {
 
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();
 
        for (int test_case = 1; test_case <= T; test_case++) {
 
            int N = sc.nextInt();
            int M = sc.nextInt();
 
            String cipher = "";
            for (int i = 0; i < N; i++) {
                String str = sc.next();
                if(!cipher.isEmpty()) {
                    continue;
                }
                str = str.replaceAll("0+$", "");
                if (!str.isEmpty()) {
                    cipher = str.substring(str.length()-56);
                }
            }
             
            int[] arr = new int[8];
            for(int i = 0; i<8; i++) {
                String number = cipher.substring(i*7,(i+1)*7);
                switch(number) {
                case "0001101": arr[i] = 0; break;
                case "0011001": arr[i] = 1; break;
                case "0010011": arr[i] = 2; break;
                case "0111101": arr[i] = 3; break;
                case "0100011": arr[i] = 4; break;
                case "0110001": arr[i] = 5; break;
                case "0101111": arr[i] = 6; break;
                case "0111011": arr[i] = 7; break;
                case "0110111": arr[i] = 8; break;
                case "0001011": arr[i] = 9; break;
                }
            }
             
            int odd = arr[0]+arr[2]+arr[4]+arr[6];
            int even = arr[1]+arr[3]+arr[5]+arr[7];
             
            boolean right = ((odd*3)+even)%10==0;
            System.out.println("#" + test_case + " " + (right ? odd+even : 0));
 
        }
    }
}