import edu.princeton.cs.algs4.Point2D;
import edu.princeton.cs.algs4.RectHV;
import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.Queue;
import java.util.ArrayList;
import java.util.List;

public class KdTree{

    private Node root;     // root of the BST
    private int size;
    private Point2D nearestPoint;
    private double minDistance;

	public KdTree(){
		root = null;
		size = 0;
	}

	private class Node{
		private Point2D point;           // point
        private Node left, right;  // links to left and right subtrees
        private boolean xSplit;     // color of parent link
        private int size;          // subtree count

        public Node(Point2D point, boolean xSplit) {
            this.point = point;
            this.xSplit = xSplit;
            this.left = null;
            this.right = null;
        	this.size = 1;
        }

	}
	public  boolean isEmpty()  {
		return root == null;
	}          // is the set empty?
	public   int size() {
		return size(root);
	}             // number of points in the set

	private int size(Node x){
		if(x == null) return 0;
		return x.size;
	}

	public void insert(Point2D p)     {
		if(p == null) throw new java.lang.IllegalArgumentException();
			root = insert(root, p, false);
	}
         // add the point to the set (if it is not already in the set)


	// insert the key-value pair in the subtree rooted at h
	private Node insert(Node h, Point2D pt, boolean xSplit) {
	    if (h == null) return new Node(pt, xSplit);

	    if (pt.compareTo(h.point) == 0) return h;

	   	double cmp ;
	   	if(xSplit == false){
	   		cmp = pt.x() - h.point.x();
	   	}else{
	   		cmp = pt.y() - h.point.y();
	   	}

	   	if(cmp < 0){
	   		h.left = insert(h.left, pt, !xSplit);
	   	}else{
	   		h.right = insert(h.right, pt, !xSplit);
	   	}

		h.size = 1 + size(h.left) + size(h.right);
	    return h;
	}

	 public boolean contains(Point2D p) {
	 	if (p == null) throw new IllegalArgumentException();
        Node x = contains(root, p);
        return x != null;
    	}

	    private Node contains(Node x, Point2D p) {
	        if(x == null){
	        	return null;
	        }

	        if(p.compareTo(x.point) == 0) {
	        	return x;
	        }

	    double cmp;
	   	if(x.xSplit == false){
	   		cmp = p.x() - x.point.x();
	   	}else{
	   		cmp = p.y() - x.point.y();
	   	}

	   	if(cmp < 0){
	   		return contains(x.left, p);
	   	}else{
	   		return contains(x.right, p);
	   	}
	}

	public  void draw()  {
		draw(root);
	}       // draw all points to standard draw

	private void draw(Node x) {
		if( x == null) return;

		StdDraw.setPenColor(StdDraw.BLACK);
		x.point.draw();

		if(x.xSplit == false){
			StdDraw.setPenColor(StdDraw.BOOK_BLUE);
			StdDraw.line(x.point.x(), 0, x.point.x(), 1);
		}else{
			StdDraw.setPenColor(StdDraw.BOOK_RED);
            StdDraw.line(0, x.point.y(), 1, x.point.y());
		}
	}

	public Iterable<Point2D> range(RectHV rect)  {
		if (rect == null) {
            throw new IllegalArgumentException("rect can't be null");
        }
		List<Point2D> res = new ArrayList<Point2D>();
		if(!isEmpty()){
			range(root, rect, res);
		}

		return res;
	}    // all points that are inside the rectangle (or on the boundary)


	private void range(Node x, RectHV rect, List<Point2D> res){
		if(x == null) return;

		if(rect.contains(x.point)) {
			res.add(x.point);
		}

		if(x.xSplit == false){
			if(rect.xmax() < x.point.x()){
				range(x.left, rect, res);
			}else if(rect.xmin() >= x.point.x()){
				range(x.right, rect, res);
			}else{//intersects
				range(x.left, rect, res);
				range(x.right, rect, res);
			}
		}else{
			if(rect.ymax() < x.point.y()){
				range(x.left, rect, res);
			}else if(rect.ymin() >= x.point.y()){
				range(x.right, rect, res);
			}else{
				range(x.left, rect, res);
				range(x.right, rect, res);
			}
		}
	}


	public Point2D nearest(Point2D p)      {
		 if (p == null) {
            throw new IllegalArgumentException("point can't be null");
        }
		nearestPoint = null;
   		minDistance = Double.POSITIVE_INFINITY;
   		nearest(root, p);
    	return nearestPoint;
	}       // a nearest neighbor in the set to point p; null if the set is empty


	private void nearest(Node x, Point2D p){
		if(x == null) return;

		double distance = p.distanceSquaredTo(x.point);

		if(distance< minDistance) {
			minDistance = distance;
			nearestPoint = x.point;
		}

		if(x.xSplit == false){
			if(p.x() < x.point.x()){
				nearest(x.left, p);
				if(minDistance >= x.point.x() - p.x()){
					nearest(x.right, p);
				}
			}else{
				nearest(x.right, p);
				if(minDistance >= p.x() - x.point.x()){
					nearest(x.left,p);
				}
			}
		}else{
			if(p.y() < x.point.y()) {
				nearest(x.left, p);
				if(minDistance >= x.point.y() - p.y()){
					nearest(x.right, p);
				}
			} else{
				nearest(x.right, p);
				if(minDistance >= p.y() - x.point.y()) {
					nearest(x.left, p);
				}
			}
		}
	}
}
