import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
        for(int tc = 1; tc <= T; tc++){
            
            // 날짜
        	int N = sc.nextInt();
            
            // 매매가
            int[] prices = new int[N];
            
            for(int i = 0; i < N; i++){
            	prices[i] = sc.nextInt();
            }
            
            long profit = maxProfit(prices);
            
            System.out.println("#" + tc + " " + profit);
            
        }
	}
    
    private static long maxProfit(int[] prices){
    	long profit = 0;
        
        int max = 0;
        
        for(int i = prices.length-1; i >=0; i--){
        	int today = prices[i];
            if(max > today){
            	profit += max - today;
            }else{
            	max = today;
            }
        }
        
        return profit;
    }
}