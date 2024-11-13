public class Main {
    public static void main(String[] args) {
        // Sample grid
        int[][] grid = {
            {10, 3, 11, 14, 8},
            {6, 15, 7, 12, 16},
            {9, 2, 13, 15, 5},
            {4, 11, 10, 6, 17},
            {18, 7, 1, 8, 19}
        };

        GridPath gridPath = new GridPath(grid);

        // Test getNextLoc
        Location loc1 = gridPath.getNextLoc(0, 0); // Should return Location(0, 1)
        System.out.println("getNextLoc(0, 0): (" + loc1.getRow() + ", " + loc1.getCol() + ")");

        Location loc2 = gridPath.getNextLoc(1, 3); // Should return Location(2, 3)
        System.out.println("getNextLoc(1, 3): (" + loc2.getRow() + ", " + loc2.getCol() + ")");

        Location loc3 = gridPath.getNextLoc(2, 4); // Should return Location(3, 4)
        System.out.println("getNextLoc(2, 4): (" + loc3.getRow() + ", " + loc3.getCol() + ")");

        Location loc4 = gridPath.getNextLoc(4, 3); // Should return Location(4, 4)
        System.out.println("getNextLoc(4, 3): (" + loc4.getRow() + ", " + loc4.getCol() + ")");

        // Test sumPath
        int sum = gridPath.sumPath(1, 1); // Example path sum starting from (1, 1)
        System.out.println("sumPath(1, 1): " + sum);
    }
}
