class Solution {
    
    static int[] memo = new int[100001];
    
    public int solution(int n) {
    
        return fibo(n);
    }
    
     public static int fibo(int n){
        if(n == 0) return 0;
        if(n == 1 || n == 2) return 1;

        // 이미 계산된 값이면 반환
        if (memo[n] != 0) return memo[n];
        
        return memo[n] = (fibo(n-1) + fibo(n-2)) % 1234567;
    }
}