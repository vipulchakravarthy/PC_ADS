
import edu.princeton.cs.algs4.Queue;

// import java.util.Arrays;
// import java.util.Stack;
// import java.util.Queue;
// import java.util.LinkedList;

public class Board {

    // create a board from an n-by-n array of tiles,
    // where tiles[row][col] = tile at (row, col)
    private int[][] tiles;
    private int n;
    private int space = 0;

    public Board(int[][] blocks){

        if (blocks == null || blocks.length != blocks[0].length) {
            throw new java.lang.IllegalArgumentException();
        }
        this.n = blocks.length;
        this.tiles = new int[n][n];
        this.tiles = copy(blocks);
    }


     private int[][] copy(int[][] blocks) {
        int[][] copy = new int[blocks.length][blocks.length];
        for (int row = 0; row < blocks.length; row++)
            for (int col = 0; col < blocks.length; col++)
                copy[row][col] = blocks[row][col];

        return copy;
    }


    // string representation of this board
    public String toString(){
    	StringBuilder str = new StringBuilder();
        str.append(dimension() + "\n");
        for (int row = 0; row < tiles.length; row++) {
            for (int col = 0; col < tiles.length; col++){
                str.append(String.format("%2d ", block(row, col)));
            }
            str.append("\n");
        }

        return str.toString();
    }

    private int block(int row, int col) {
        return tiles[row][col];
    }

    // board dimension n
    public int dimension(){
        return this.n;
    }

    // number of tiles out of place
    public int hamming(){
    	int count = 0;
    	for(int i = 0; i < this.n; i++) {
    		for(int j = 0; j < this.n; j++) {
    			if(isNotRightBlock(i,j)){
    				count++;
    			}
    		}
    	}
    	return count;
    }


    private boolean isNotRightBlock(int row, int col){
    	int tile = this.tiles[row][col];
    	return tile != space && tile != goalTile(row, col);
    }

    private int goalTile(int row, int col){
    	int tileValue = row*(this.n) + col + 1;
    	return tileValue;
    }

    // sum of Manhattan distances between tiles and goal
    public int manhattan(){
    	int sum = 0;
        for (int row = 0; row < tiles.length; row++){
            for (int col = 0; col < tiles.length; col++){
                sum += calculateDistances(row, col);
            }
        }

    	return sum;
    }

    private int calculateDistances(int row, int col){
    	int tileValue = tiles[row][col];

        return (tileValue == 0) ? 0 : Math.abs(row - row(tileValue)) + Math.abs(col - col(tileValue));
    }

    private int row (int block) {
        return (block - 1) / this.n;
    }

    private int col (int block) {
        return (block - 1) % this.n;
    }

    // is this board the goal board?
    public boolean isGoal(){
    	for(int row = 0; row < this.n; row++){
    		for(int col = 0; col < this.n ; col++){
    			if(isNotRightBlock(row,col)){
    				return false;
    			}
    		}
    	}
    	return true;
    }

    // does this board equal y?
    public boolean equals(Object y){

    	if(y == this ) return true;
         if(y == null || !(y instanceof Board) || ((Board)y).tiles.length != tiles.length)  return false;

    	for (int row = 0; row < tiles.length; row++){
    	    for (int col = 0; col < tiles.length; col++){
   	            if (((Board) y).tiles[row][col] != this.tiles[row][col]){
   	            	return false;
   	            }
    	    }
    	}
    	return true;
    }

    // all neighboring boards
    public Iterable<Board> neighbors(){
    	int spaceLoc = spaceLocation();
    	Queue<Board> neighbors = new Queue<Board>();
    	int spaceRow = spaceLoc/dimension();
        int spaceCol = spaceLoc %dimension();

        if (spaceRow > 0)   {
        	neighbors.enqueue(new Board(swap(spaceRow, spaceCol, spaceRow - 1, spaceCol)));
        }
        if (spaceRow < dimension() - 1) {
        	neighbors.enqueue(new Board(swap(spaceRow, spaceCol, spaceRow + 1, spaceCol)));
        }
        if (spaceCol > 0) {
        	neighbors.enqueue(new Board(swap(spaceRow, spaceCol, spaceRow, spaceCol - 1)));
        }
        if (spaceCol < dimension() - 1) {
        	neighbors.enqueue(new Board(swap(spaceRow, spaceCol, spaceRow, spaceCol + 1)));
        }
        return neighbors;
    }

    private int[][] swap(int rowA, int colA, int rowB, int colB){
    	int[][] tilesCopy = copy(this.tiles);
    	int temp = this.tiles[rowA][colA];
    	tilesCopy[rowA][colA] = tilesCopy[rowB][colB];
    	tilesCopy[rowB][colB] = temp;
    	return tilesCopy;
    }

    private int spaceLocation(){
    	for(int row = 0; row < this.n; row++){
    		for(int col = 0; col < this.n; col++){
    			if(this.tiles[row][col] == space){
    				return row*this.dimension() + col;
    			}
    		}
    	}

        return -1;
    }

    // a board that is obtained by exchanging any pair of tiles
    public Board twin(){
        for (int row = 0; row < this.tiles.length; row++)
                    for (int col = 0; col < this.tiles.length - 1; col++)
                        if (this.tiles[row][col] != 0 && this.tiles[row][col+1] != 0)
                            return new Board(swap(row, col, row, col + 1));
                throw new RuntimeException();
    }

    // unit testing (not graded)
    public static void main(String[] args) {
        // Board board = new Board(new int[][]{{1, 2, 3}, {4, 0, 6}, {7, 8, 5}});
        // System.out.println(board.toString());
        // for (Board board1 :
        //         board.neighbors()) {
        //     System.out.println(board1);
        // }
    }

}
