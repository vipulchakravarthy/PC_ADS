import edu.princeton.cs.algs4.WeightedQuickUnionUF;

public class Percolation {
   private boolean[][] grid;
    private int top = 0;
    private int bottom;
    private int size;
    private int openedSites = 0;
    private WeightedQuickUnionUF qf;

    /**
     * Creates N-by-N grid, with all sites blocked.
     */
    public Percolation(int N) {
        if(N <= 0){
            throw new IllegalArgumentException();
        }
        size = N;
        bottom = size * size + 1;
        qf = new WeightedQuickUnionUF(size * size + 2);
        grid = new boolean[size][size];
    }

    /**
     * Opens site (row i, column j) if it is not already.
     */
    public void open(int i, int j) {
        if (0 < i && i <= size && 0 < j && j <= size) {
            if(grid[i-1][j-1]){
                return;
            }
            grid[i - 1][j - 1] = true;
            openedSites += 1;
            if (i == 1) {
                qf.union(get1DPosition(i, j), top);
            }
            if (i == size) {
                qf.union(get1DPosition(i, j), bottom);
            }

            if (j > 1 && isOpen(i, j - 1)) {
                qf.union(get1DPosition(i, j), get1DPosition(i, j - 1));
            }
            if (j < size && isOpen(i, j + 1)) {
                qf.union(get1DPosition(i, j), get1DPosition(i, j + 1));
            }
            if (i > 1 && isOpen(i - 1, j)) {
                qf.union(get1DPosition(i, j), get1DPosition(i - 1, j));
            }
            if (i < size && isOpen(i + 1, j)) {
                qf.union(get1DPosition(i, j), get1DPosition(i + 1, j));
            }
        }else {
            throw new IllegalArgumentException();
        }
    }

    private int get1DPosition(int i, int j) {
        return size * (i - 1) + j;
    }
    /**
     * Is site (row i, column j) open?
     */
    public boolean isOpen(int i, int j) {
        if (0 < i && i <= size && 0 < j && j <= size) {
            return grid[i-1][j-1];
        } else {
            throw new IllegalArgumentException();
        }
    }

     public int numberOfOpenSites(){
        return openedSites;
     }

    /**
     * Is site (row i, column j) full?
     */
    public boolean isFull(int i, int j) {
        if (0 < i && i <= size && 0 < j && j <= size) {
            return qf.connected(top, get1DPosition(i , j));
        } else {
            throw new IllegalArgumentException();
        }
    }

    /**
     * Does the system percolate?
     */
    public boolean percolates() {
        return qf.connected(top, bottom);
    }


public static void main(String[] args) {

}



}
