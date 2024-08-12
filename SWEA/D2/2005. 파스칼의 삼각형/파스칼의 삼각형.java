import java.util.Scanner;
import java.io.FileInputStream;


class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        for(int t = 1; t <= T; t++){
        	
            int n = sc.nextInt();
            int[][] ta = new int[n][n];
            
            System.out.println("#"+t);
          
            for(int i = 0; i < n; i++){
            	for(int j = 0; j <= i; j++){
                	if(j==0 || j==i){
                    	ta[i][j] = 1;
                    }else{
                        ta[i][j] = ta[i-1][j-1] + ta[i-1][j];
               	 	}
                    System.out.print(ta[i][j]+" ");
            	}
                System.out.println();
            }
        }
	
	}
}
