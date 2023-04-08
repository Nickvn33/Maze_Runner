package maze;

public class Maze {
    int[][] maze;
    public Maze(int[][] maze) {
        this.maze = maze;
    }

    public void printMaze() {
        for (int i = 0; i < this.maze.length; i++) {
            for (int j = 0; j < this.maze[0].length; j++) {
                if (this.maze[i][j] == 1) {
                    System.out.print("\u2588\u2588");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print('\n');
        }
    }
}
