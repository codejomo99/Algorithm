import java.util.Scanner;
import java.io.FileInputStream;


class Solution
{
	public static void main(String args[]) throws Exception
	{

		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();


		for(int t=1; t <= T; t++)
		{
			int n = sc.nextInt();
            int m = sc.nextInt();
            
            int[][] arr = new int[n][n];
            
            // 입력
            for(int i = 0; i < n; i++){
            	for(int j = 0; j < n; j++){
                	arr[i][j] = sc.nextInt();
                }
            }
            
            int max = 0;
            
            for(int i = 0; i < n-m+1; i++){
            	for(int j = 0; j < n-m+1; j++){
                	int sum = 0;
                    for(int s = 0; s < m; s++){
                    	for(int q = 0; q < m; q++){
                        	sum += arr[i+s][j+q];
                        }
                    }
                    max = Math.max(max,sum);
                }
            }
            
            System.out.println("#"+t+" "+max);
                    
                    
		}
	}
}