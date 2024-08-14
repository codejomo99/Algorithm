import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		
		
		for(int t = 1; t <= T; t++)
		{	
            int[] arr= new int[10];
            
			for(int i = 0; i < 10; i++){
            	arr[i] = sc.nextInt();
            }
           
            int sum = 0, max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
            
            for(int i : arr){
            	sum+=i;
            }
            
            for(int i : arr){
            	if( i > max){
                	max = i;
                    Math.max(max,i);
                }
            }
            
            for(int i : arr){
            	if( i < min){
                	min = i;
                    Math.min(min,i);
                }
            }
			
            sum = sum - max - min;
            double avg = sum / 8.0;
            
            System.out.println("#"+t+" "+Math.round(avg));
		}
	}
}