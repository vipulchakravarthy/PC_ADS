import edu.princeton.cs.algs4.Point2D;
import edu.princeton.cs.algs4.RectHV;
import edu.princeton.cs.algs4.StdDraw;
import java.util.HashSet;
import java.util.Set;


public class Point2D implements Comparable<Point2D> {
	double x;
	double y;

 	public Point2D(double x, double y)   {     // construct the point (x, y){
   		this.x = x;
   		this.y = y;
   }


   public  double x(){
   	return this.x;
   }                           // x-coordinate
   public  double y()     {
   	return this.y;
   }                         // y-coordinate
   public  double distanceTo(Point2D that) {
 	return Math.sqrt((that.x- this.x)^2 +  (that.y- this.y)^2);
   }        // Euclidean distance between two points
   public  double distanceSquaredTo(Point2D that) {
   	double res = this.distanceTo(that);
   	return res * res;
   } // square of Euclidean distance between two points
   public     int compareTo(Point2D that)  {
   		if(this.y < that.y){
   			return -1;
   		} else if(this.y > that.y){
   			return 1;
   		}else{
   			if(this.x < that.x){
   				return -1;
   			}else if(this.x > that.x){
   				return 1;
   			}
   		}
   		return 0;
   }// for use in an ordered symbol table


   public boolean equals(Object that)    {
   		if (other == this) return true;
        if (other == null) return false;
        if (other.getClass() != this.getClass()) return false;
        Point2D that = (Point2D) other;
        return this.x == that.x && this.y == that.y;
   }          // does this point equal that object?

   public    void draw()     {
   	StdDraw.point(x, y);
   }                      // draw to standard draw
   public  String toString()  {
   	return "(" + x + ", " + y + ")";
   }                     // string representation
}
