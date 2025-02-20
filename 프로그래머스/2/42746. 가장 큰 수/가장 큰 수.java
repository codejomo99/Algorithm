import java.util.*;
class Solution {
    public String solution(int[] numbers) {
        String[] nums = Arrays.stream(numbers).mapToObj(String::valueOf).toArray(String[]::new);
        
        Arrays.sort(nums,(a,b)->(b+a).compareTo(a+b));
        
        StringBuilder sb = new StringBuilder();
        
        for(String num : nums){
            sb.append(num);
        }
        
        if(sb.charAt(0) == '0') return "0";

        return sb.toString();
    }
}