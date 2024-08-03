class Solution {
    public String[] solution(String[] picture, int k) {
        // 기존 그림의 크기
        int originalHeight = picture.length;
        int originalWidth = picture[0].length();
        
        // 확대된 그림의 크기
        int scaledHeight = originalHeight * k;
        int scaledWidth = originalWidth * k;
        
        String[] answer = new String[scaledHeight];
        
        // 확대된 그림을 구성
        for (int i = 0; i < originalHeight; i++) {
            String originalRow = picture[i];
            // 각 행을 k번 반복해서 추가
            for (int j = 0; j < k; j++) {
                StringBuilder sb = new StringBuilder();
                // 각 문자에 대해 k번 반복해서 추가
                for (int l = 0; l < originalWidth; l++) {
                    char c = originalRow.charAt(l);
                    for (int m = 0; m < k; m++) {
                        sb.append(c);
                    }
                }
                answer[i * k + j] = sb.toString();
            }
        }
        
        return answer;
    }
}
