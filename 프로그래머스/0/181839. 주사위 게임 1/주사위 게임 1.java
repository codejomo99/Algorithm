class Solution {
    public int solution(int a, int b) {
        
        boolean flag1 = true;
        boolean flag2 = true;
        
        if(a % 2 == 0)
            flag1 = true;
        else 
            flag1 = false;
        
        if(b % 2 == 0)
            flag2 = true;
        else
            flag2 = false;
        
        if(!flag1 && !flag2){
            return a*a + b*b;
        }else if(flag1 && !flag2 || !flag1 && flag2){
            return 2*(a+b);
        }else
            return Math.abs(a - b);
        
        
        
        
    }
}