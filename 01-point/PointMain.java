import java.util.ArrayList;

public class PointMain {
    public static void main(String[] args) {
        ArrayList<Point> pointlist = new ArrayList<Point>();

        pointlist.add(new Point());
        System.out.println(pointlist.get(0));

        pointlist.add(new Point(2,1));
        System.out.println(pointlist.get(0).distance(pointlist.get(1)));
        System.out.println(pointlist.get(0).midpoint(pointlist.get(1)));
        System.out.println(pointlist.get(0).slope(pointlist.get(1)));

        pointlist.add(new Point(4,2));
        System.out.println(pointlist.get(0).isCollinear(pointlist.get(1), pointlist.get(2)));
        
    }    
}
