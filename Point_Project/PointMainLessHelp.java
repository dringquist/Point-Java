// A program that deals with 2D points.
// Fifth version, to accompany immutable Point class.
import java.util.Scanner;
import java.util.ArrayList;
import java.awt.*;

public class PointMainLessHelp {
    public static void main(String[] args) {
        
        DrawingPanel panel = new DrawingPanel(800,800);
        Graphics g = panel.getGraphics();
        // create two Point objects
        PointLess p1 = new PointLess(1,1);
        PointLess p2 = new PointLess(0,5);
        
        Scanner scnr = new Scanner(System.in);
        ArrayList<PointLess> points = new ArrayList<PointLess>();
        
        int xcoor;
        int ycoor;
        System.out.println("Type in Numbers to add Points");
        do{
            xcoor = scnr.nextInt();
            ycoor = scnr.nextInt();
        }
        while(xcoor <= 0 || ycoor <= 0);
        
        for(int i = 0; i <= 5; i++){
         
            PointLess temp = new PointLess(xcoor, ycoor);
            points.add(temp);
            
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
