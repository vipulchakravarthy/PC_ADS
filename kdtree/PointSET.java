import edu.princeton.cs.algs4.Point2D;
import edu.princeton.cs.algs4.RectHV;
import edu.princeton.cs.algs4.StdDraw;
import java.util.TreeSet;
import java.util.Set;

public class PointSET {

	private final Set<Point2D> set;
   public         PointSET()    {
   	set = new TreeSet<Point2D>();
   }                           // construct an empty set of points
   public   boolean isEmpty()            {
   	return this.set.isEmpty();
   }          // is the set empty?
   public               int size()            {
   	return this.set.size();
   }             // number of points in the set

   public void insert(Point2D p)     {
      if(p == null) throw new java.lang.IllegalArgumentException();
   	this.set.add(p);
   }         // add the point to the set (if it is not already in the set)

   public boolean contains(Point2D p) {
      if(p == null) throw new java.lang.IllegalArgumentException();
		return set.contains(p);
   }           // does the set contain point p?

   public  void draw()  {
   	for(Point2D p : set){
   		StdDraw.point(p.x(), p.y());
   	}
   }       // draw all points to standard draw

   public Iterable<Point2D> range(RectHV rect)  {
         if(rect == null) throw new java.lang.IllegalArgumentException();
   		Set<Point2D> res = new TreeSet<Point2D>();
   		for(Point2D p: this.set){
   			if(rect.contains(p)){
   				res.add(p);
   			}
   		}
   		return res;
   }    // all points that are inside the rectangle (or on the boundary)

   public Point2D nearest(Point2D p)      {
      if(p == null) throw new java.lang.IllegalArgumentException();
   		Point2D closestPoint = null;
   		double min = Double.POSITIVE_INFINITY;
   		for(Point2D pt: this.set){
   			if(pt.distanceSquaredTo(p) < min){
   				min = pt.distanceSquaredTo(p);
   				closestPoint = pt;
   			}
    	}
    	return closestPoint;
   }       // a nearest neighbor in the set to point p; null if the set is empty

   public static void main(String[] args)  {

   }                // unit testing of the methods (optional)
}
