package OOP.lecture1.Distance;

/*
 Это точка 2D
 */
public class Point2D {
    private int x, y;

    /**
     * Это констуктор
     * @param valueX это координата X
     * @param valueY это координата Y
     */


    public Point2D(int valueX, int valueY) {
        x = valueX;
        y = valueY;
    }

    public Point2D(int value) { // это перегрузка в контексте конструктора
        /*this.x = value;
        this.y = value;*/
        this (value, value);
    }

    public Point2D() { // это перегрузка в контексте конструктора
        /*x = 0;
        y = 0;*/
        this(0);
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public void setX(int value){
        this.x = value;
    }

    public void setY(int value){
        this.y = value;
    }

    public String getInfo() {
        return String.format("x: %d, y: %d", x, y);
    }




    public static double distance(Point2D a, Point2D b){
        return Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2));
    }



    @Override
    public String toString() {
        return getInfo();
    }
}
