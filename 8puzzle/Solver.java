import edu.princeton.cs.algs4.MinPQ;
import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.Queue;

// import java.util.Arrays;
// import java.util.Stack;
// import java.util.Queue;
// import java.util.Scanner;

public class Solver {

    // find a solution to the initial board (using the A* algorithm)

   private class Node implements Comparable<Node> {
   		private Node previous;
   		private Board board;
   		private int moves;

   		public Node(Board board){
          if (board == null) {
              throw new java.lang.IllegalArgumentException();
          }
   			this.board = board;
   			this.moves = 0;
   			this.previous = null;
   		}


   		public Node(Board board, Node prev){
   			this.board = board;
   			this.previous = prev;
   			this.moves = prev.moves + 1;
   		}

   		public int compareTo(Node that){
   			return (this.board.manhattan() - that.board.manhattan()) + (this.moves - that.moves);
   		}

   		public int getMoves(){
   			return this.moves;
   		}
   }

   private Node lastMove;

    public Solver(Board initial){
      if (initial == null) {
        throw new java.lang.IllegalArgumentException();
      }
      MinPQ<Node> nodes = new MinPQ<>();
      nodes.insert(new Node(initial));
    	lastMove = nodes.delMin();
    	// if (node.board.hamming() == 2) node.board = node.board.twin();
    	if (lastMove.board.isGoal()) return;
    	for (Board b : lastMove.board.neighbors()) {
    	    nodes.insert(new Node(b, lastMove));
    	}
    	while (true) {
    	    // if (min.isEmpty()) min.insert(new Node(initial.));
    	    lastMove = nodes.delMin();
    	    if (lastMove.board.isGoal()) return;
    	    // if (node.board.hamming() == 2) node.board = node.board.twin();
    	    for (Board b : lastMove.board.neighbors()) {
    	        if (!(b.equals(lastMove.previous.board))) {
    	                nodes.insert(new Node(b, lastMove));
    	        }
    	    }
    	}
    }

    // private Node checker(MinPQ<Node> nodes){
    // 	if(nodes.isEmpty()) return null;

    // 	Node deleted = nodes.delMin();
    // 	System.out.println(deleted.board);
    // 	// Queue<Board> q = deleted.board.neighbors();
    // 	if(deleted.board.isGoal()){
    // 		return deleted;
    // 	}

    // 	for(Board b: deleted.board.neighbors()){
    // 		//same node should not be in the pq
    // 		//check for the previous one null also.
    // 		if(deleted.previous == null || !b.equals(deleted.previous.board)){
    // 			//System.out.println(b);
    // 			nodes.insert(new Node(b, deleted));
    // 		}
    // 	}
    // 	return null;
    // }

    // is the initial board solvable? (see below)
    public boolean isSolvable(){
    	return (lastMove != null);
    }

    // min number of moves to solve initial board
    public int moves(){
    	if(lastMove == null){
    		return -1;
    	}
    	return lastMove.moves;
    }

    // sequence of boards in a shortest solution
    public Iterable<Board> solution(){
    	if (!isSolvable()) return null;

        Stack<Board> stk = new Stack<Board>();
        while(lastMove != null) {
            stk.push(lastMove.board);
            lastMove = lastMove.previous;
        }

        return stk;
    }

    // test client (see below)
    public static void main(String[] args){
     //  // int n = in.readInt();
    	// Scanner scan = new Scanner(System.in);
    	// int n = scan.nextInt();
     //    int[][] blocks = new int[n][n];
     //    for (int i = 0; i < n; i++)
     //        for (int j = 0; j < n; j++)
     //            blocks[i][j] = scan.nextInt();
     //    Board initial = new Board(blocks);

     //    // solve the puzzle
     //    Solver solver = new Solver(initial);

     //    // print solution to standard output
     //    System.out.println("Minimum number of moves = " + solver.moves());
     //    // if (!solver.isSolvable())
     //    //     System.out.println("No solution possible");
     //    // else {

        //     for (Board board : solver.solution())
        //         System.out.println(board);
    }

}
