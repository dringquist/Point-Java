// A program that deals with 2D points.
// Fifth version, to accompany immutable Point class.
import java.util.Scanner;
import java.util.ArrayList;

public class PointMainLessHelp {
    public static void main(String[] args) {
        // create two Point objects
        PointLess p1 = new PointLess(1,1);
        PointLess p2 = new PointLess(0,5);
        
        Scanner scnr = new Scanner(System.in);
        ArrayList<Integer> points = new ArrayList<Integer>();
        
        System.out.println("Type in Numbers to add Points");
        for(int i = 0; i <= 10; i++){
   
            points.add(scnr.nextInt());
    }
        
        
        

        // print each point and its distance from origin
        System.out.println("p1 is " + p1);
        System.out.println("p1 distance from origin = " + p1.distanceFromOrigin());

        System.out.println("p2 is " + p2);
        System.out.println("p2 distance from origin = " +  p2.distanceFromOrigin());
        
        //Creates a other object
        PointLess other = new PointLess(5,5);
        
        System.out.println(p1.slope(other));
        System.out.println(p2.slope(other));
        
        System.out.println(p1.isCollinear(p1, p2));
        System.out.println(p2.isCollinear(p1, p2));

        // translate each point to a new location
        p1 = p1.translate(1,1);
        p2 = p2.translate(0,5);

        // print the points again
        System.out.println("p1 translated is now " + p1);
        System.out.println("p2 translated is now " + p2);
        
       
       
        
        
        
        
    }
}
