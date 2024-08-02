class Solution {
    public int solution(int[] num_list, int n) {
        
        int answer = 0;
        
        for(int i : num_list){
            answer = i == n ? 1 : 0;
            
            if(answer == 1){ break; }
        }
        
        return answer;
    }
}