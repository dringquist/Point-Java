// A program that deals with 2D points.
// Fifth version, to accompany immutable Point class.

public class PointMainMoreHelp {
    public static void main(String[] args) {
        // create two Point objects
        Point p1 = new Point(?, ?);
        Point p2 = new Point(?, ?);

        // print each point and its distance from origin
        System.out.println("p1 is " + ?);
        System.out.println("p1 distance from origin is = " +
                           ?.distanceFromOrigin());

        System.out.println("p2 is " + p2);
        System.out.println("p2 distance from origin is = " +
                           ?.distanceFromOrigin());

        // translate each point to a new location
        p1 = p1.?(11, 6);
        p2 = p2.?(1, 7);

        // print the points again
        System.out.println("p1 is " + p1);
        System.out.println("p2 is " + p2);
    }
}
