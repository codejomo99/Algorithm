class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        boolean[] visit = new boolean[10];
        
        for(int i : numbers){
            visit[i] = true;
        }
        
        for(int i = 0; i <= 9; i++){
            if(!visit[i]){
                answer+= i;
            }
        }
    
        
        return answer;
    }
}