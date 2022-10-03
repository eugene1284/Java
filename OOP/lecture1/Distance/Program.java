package OOP.lecture1.Distance;

public class Program {
    public static void main(String[] args) {
        Point2D a = new Point2D(0,2);
        Point2D b = new Point2D(0);
        var dis = Point2D.distance(a,b);
        System.out.println(dis);
    }
}
