import java.util.*;

public class Problem0101 {
  public static boolean searchBFS(int[][] matrix, int value) {
    int rows = matrix.length, cols = matrix[0].length;
    boolean[][] visited = new boolean[rows][cols];

    Queue<int[]> q = new LinkedList<>();
    q.add(new int[]{0,0});

    while (!q.isEmpty()) {
      int[] position = q.poll();
      int x = position[0], y = position[1];
      visited[x][y] = true;

      if (matrix[x][y] == value) return true;
      if (x+1 < rows && !visited[x+1][y]) q.add(new int[]{x+1,y});
      if (x-1 >= 0 && !visited[x-1][y]) q.add(new int[]{x-1,y});
      if (y+1 < cols && !visited[x][y+1]) q.add(new int[]{x,y+1});
      if (y-1 >= 0 && !visited[x][y-1]) q.add(new int[]{x,y-1});
    }

    return false;
  }

  public static void main(String[] args) {
    int[][] matrix = {{1,3,2}, {5,19,30}, {44,9,52}};

    System.out.println("[value:19] " + searchBFS(matrix, 19));
    System.out.println("[value:55] " + searchBFS(matrix, 55));
  }
}
