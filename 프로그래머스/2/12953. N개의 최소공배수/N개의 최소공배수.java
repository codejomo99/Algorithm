class Solution {
    public int solution(int[] arr) {
        int result = arr[0];
        
        for(int i = 1; i < arr.length; i++){
            result = lcm(result, arr[i]);
        }
        
        return result;
    }
    // 최소 공배수
    public static int lcm(int a, int b){
        return (a * b) / gcd(a,b);
    }
    
    // 최대 공약수
    public static int gcd(int a, int b){
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}