import java.util.*;

public class Problem0102 {
  public static boolean search(int[][] matrix, int value) {
    int rows = matrix.length, cols = matrix[0].length;
    boolean[][] visited = new boolean[rows][cols];

    return searchDFS(matrix, visited, 0, 0, rows, cols, value); 
  }

  public static boolean searchDFS(int[][] matrix, boolean[][] visited, int x, int y, int rows, int cols, int value) {
    if (matrix[x][y] == value) return true;

    visited[x][y] = true;
    if (x+1 < rows && !visited[x+1][y]) return searchDFS(matrix, visited, x+1, y, rows, cols, value);
    if (x-1 >= 0 && !visited[x-1][y]) return searchDFS(matrix, visited, x-1, y, rows, cols, value);
    if (y+1 < cols && !visited[x][y+1]) return searchDFS(matrix, visited, x, y+1, rows, cols, value);
    if (y-1 >= 0 && !visited[x][y-1]) return searchDFS(matrix, visited, x, y-1, rows, cols, value);

    return false;
  }

  public static void main(String[] args) {
    int[][] matrix = {{2,3,19}, {15,22,29}, {30,40,55}};

    System.out.println("[value: 15] " + search(matrix, 15));
    System.out.println("[value: 88] " + search(matrix, 88));
  }
}
