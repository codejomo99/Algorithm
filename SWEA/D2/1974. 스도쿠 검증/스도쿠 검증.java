import java.util.Scanner;

class Solution {

  public static void main(String args[]) throws Exception {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();

    for(int t = 1; t <= T; t++) {
      int[][] board = new int[9][9];

      // 입력 받음
      for (int i = 0; i < 9; i++) {
        for (int j = 0; j < 9; j++) {
          board[i][j] = sc.nextInt();
        }
      }

      // 행, 열, 3x3 박스가 모두 유효한지 체크
      if(checkX(board) && checkY(board) && checkBox(board)){
        System.out.println("#" + t + " " + 1);
      } else {
        System.out.println("#" + t + " " + 0);
      }
    }
    sc.close();
  }

  // 행 검사
  public static boolean checkX(int[][] board) {
    for (int i = 0; i < 9; i++) {
      int[] check = new int[10];
      for (int j = 0; j < 9; j++) {
        check[board[i][j]]++;
      }
      // 숫자 1부터 9가 딱 한 번 나왔는지 확인
      for (int k = 1; k <= 9; k++) {
        if (check[k] != 1) {
          return false;  // 유효하지 않으면 false 반환
        }
      }
    }
    return true;  // 모든 행이 유효하면 true 반환
  }

  // 열 검사
  public static boolean checkY(int[][] board) {
    for (int i = 0; i < 9; i++) {
      int[] check = new int[10];
      for (int j = 0; j < 9; j++) {
        check[board[j][i]]++;
      }
      // 숫자 1부터 9가 딱 한 번 나왔는지 확인
      for (int k = 1; k <= 9; k++) {
        if (check[k] != 1) {
          return false;  // 유효하지 않으면 false 반환
        }
      }
    }
    return true;  // 모든 열이 유효하면 true 반환
  }

  // 3x3 박스 검사
  public static boolean checkBox(int[][] board) {
    for (int boxRow = 0; boxRow < 9; boxRow += 3) {
      for (int boxCol = 0; boxCol < 9; boxCol += 3) {
        int[] check = new int[10];
        for (int i = 0; i < 3; i++) {
          for (int j = 0; j < 3; j++) {
            check[board[boxRow + i][boxCol + j]]++;
          }
        }
        // 숫자 1부터 9가 딱 한 번 나왔는지 확인
        for (int k = 1; k <= 9; k++) {
          if (check[k] != 1) {
            return false;  // 유효하지 않으면 false 반환
          }
        }
      }
    }
    return true;  // 모든 박스가 유효하면 true 반환
  }
}
