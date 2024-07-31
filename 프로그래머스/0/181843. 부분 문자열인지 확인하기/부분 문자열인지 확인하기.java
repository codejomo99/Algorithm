class Solution {
    public int solution(String my_string, String target) {
        
        int length = my_string.length();
        
        for(int i = 0; i < length; i++){
            for(int j = i + 1; j <= length; j++){
                String subString = my_string.substring(i,j);
                
                if(subString.contains(target)){
                    return 1;
                }
            }
        }
        
        return 0;
    }
}