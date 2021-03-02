public class Point{
    private int x;
    private int y;

    public Point(){
        this(0, 0);
    }

    public Point(int x, int y){
        setLocation(x, y);
    }

    public double distanceFromOrigin(){
        return Math.sqrt(x*x + y*y);
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public void setLocation(int x, int y){
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public void translate(int dx, int dy){
        setLocation(x + dx, y + dy);
    }

    public double distance(Point point){
        return Math.sqrt( Math.pow(x - point.getX(),2) + Math.pow(y - point.getY(),2));
    }

    public Point midpoint(Point point){
        return new Point((x + point.getX())/2 , (y + point.getY())/2);
    }

    public double slope(Point point){
        double ys =  (y - point.getY()); 
        double xs =  (x - point.getX());
        return ys / xs;
    }

    public boolean isCollinear(Point point1, Point point2){
        double slope = this.slope(point1);
        if(slope == point1.slope(point2))
            return true;
        return false;
    }
}