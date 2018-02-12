// A Point object represents a pair of (x, y) coordinates.
// Seventh version: Immutable.
// Class invariant: x >= 0 && y >= 0.
import java.awt.*;

public class PointLess {
    public int x;
    public int y;

    // Constructs a new point at the origin, (0, 0).
    public PointLess() {
        this(0,0);    // calls Point(int, int) constructor
    }

    // Constructs a new point with the given (x, y) location.
    // pre: x >= 0 && y >= 0
    public PointLess(int x, int y) {
        if (x < 0 || y < 0) {
            throw new IllegalArgumentException();
        }

        this.x = x;
        this.y = y;
    }

    // Returns the distance between this Point and (0, 0).
    public double distanceFromOrigin() {
        return Math.sqrt(x * x + y * y);
    }

    // Returns whether o refers to a point with the same (x, y)
    // coordinates as this point.
    public boolean equals(Object o) {
        if (o instanceof PointLess) {
            PointLess other = (PointLess) o;
            return x == other.x && y == other.y;
        } else {  // not a Point object
            return false;
        }
    }

    // Returns the x-coordinate of this point.
    public int getX() {
        return x;
    }

    // Returns the y-coordinate of this point.
    public int getY() {
        return y;
    }

    // Returns a String representation of this point.
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    // Shifts this point's location by the given amount.
    // pre: x + dx >= 0 && y + dy >= 0
    public PointLess translate(int dx, int dy) {
        return new PointLess(x + dx, y + dy);
    }
    //The Slope Method
    public double slope(PointLess other){
      
      if(this.x == other.x){
         throw new IllegalArgumentException();
         }
        return (double)(other.y - this.y) / (other.x - this.x);
   }
   
   //IsCollinear Method
   public boolean isCollinear(PointLess p1, PointLess p2){
   
       double slope = (double)(p1.y - y) / (p1.x - x);
       double slope2 = (double)(p2.y - y) / (p2.x - y);
       double slope3 = (double)(p1.y - p2.y) / (p1.x - p2.y);
       
       if( x == y || slope == slope2 || slope2 == slope3 || slope == slope3){
           return true;
           
        }
       return false;
    }
    
    //Draw Method
    public void drawPoints(Graphics g){
       
        
    }
}
