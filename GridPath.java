public class GridPath {
    private int[][] grid;

    public GridPath(int[][] grid) {
        this.grid = grid;
    }

    public Location getNextLoc(int row, int col) {
        int numRows = grid.length;
        int numCols = grid[0].length;

        boolean hasRightNeighbor = col + 1 < numCols;
        boolean hasBelowNeighbor = row + 1 < numRows;

        if (hasRightNeighbor && hasBelowNeighbor) {
            int rightValue = grid[row][col + 1];
            int belowValue = grid[row + 1][col];
            if (rightValue < belowValue) {
                return new Location(row, col + 1);
            } else {
                return new Location(row + 1, col);
            }
        } else if (hasRightNeighbor) {
            return new Location(row, col + 1);
        } else if (hasBelowNeighbor) {
            return new Location(row + 1, col);
        }
        return null; // Should not be reached due to preconditions
    }

    public int sumPath(int row, int col) {
        int sum = 0;
        while (row < grid.length - 1 || col < grid[0].length - 1) {
            sum += grid[row][col];
            Location nextLoc = getNextLoc(row, col);
            row = nextLoc.getRow();
            col = nextLoc.getCol();
        }
        sum += grid[row][col]; // Add the last element in the path (bottom-right corner)
        return sum;
    }
}
