import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        for(int i = 1; i <= t; i++){
			String charNum = String.valueOf(i);
            StringBuilder sb = new StringBuilder();
            
            for(char c : charNum.toCharArray()){
            	if(c == '3' || c == '6' || c == '9'){
                	sb.append('-');
                }
            }
            
            if(sb.length() > 0){
                System.out.print(sb.toString()+" ");
            }else{
                System.out.print(i+" ");
        	}
		}
	}
}