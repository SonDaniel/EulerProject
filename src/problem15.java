/**
 * Starting in the top left corner of a 2×2 grid, and only being able to move to the right and down,
 * there are exactly 6 routes to the bottom right corner.
 * How many such routes are there through a 20×20 grid?
 * 137846528820 paths
 */
public class problem15 {
    static long[][] path = new long[21][21];

    public static void main(String[] args) {
        for (int ii = 0; ii < path.length; ii++) {
            for(int jj = 0; jj < path.length; jj++) {
                if(ii == 0 || jj == 0) {
                    path[ii][jj] = 1;
                } else {
                    path[ii][jj] = path[ii][jj - 1] + path[ii - 1][jj];
                }

            }
        }

        System.out.println("The path is " + path[20][20]);
    }
}