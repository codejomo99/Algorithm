import java.util.Scanner;


public class Solution {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    for(int t = 1; t <= T; t++) {
      int[][] puzzle = new int[9][9];

      // puzzle
      for(int i = 0; i < 9; i++){
        for(int j = 0; j < 9; j++){
          puzzle[i][j] = sc.nextInt();
        }
      }

      boolean isValid = checkPuzzle(puzzle);

      System.out.printf("#%d %d\n", t, isValid ? 1 : 0);

    }
    sc.close();
  }

  private static boolean checkPuzzle(int[][] puzzle){

    for(int i = 0; i < 9; i++){
      if(!checkRow(puzzle,i) || !checkColumn(puzzle,i) || ! checkGrid(puzzle,i)) {
        return false;
      }
    }
    return true;
  }

  // 가로
  private static boolean checkRow(int[][] puzzle, int row) {
    boolean[] found = new boolean[9];
    for (int j = 0; j < 9; j++) {
      int num = puzzle[row][j];
      if (found[num - 1]) return false; // 이미 숫자가 있다면 유효하지 않음
      found[num - 1] = true;
    }
    return true;
  }

  // 세로
  private static boolean checkColumn(int[][] puzzle, int col){
    boolean[] found = new boolean[9];
    for(int i = 0; i < 9; i++){
      int num = puzzle[i][col];
      if(found[num-1]) return false;
      found[num-1] = true;
    }
    return true;
  }

  // 3 x 3
  private static boolean checkGrid(int[][] puzzle, int grid){
    boolean[] found = new boolean[9];
    int startRow = (grid/3) * 3;
    int startCol = (grid%3) * 3;

    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        int num = puzzle[startRow + i][startCol + j];
        if (found[num - 1]) return false; // 이미 숫자가 있다면 유효하지 않음
        found[num - 1] = true;
      }
    }
    return true;

  }
}


