import java.util.Locale;

public class Point {
    public double x;
    public double y;

    public Point() {

    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public String toString()//zad1
    {
        return "Point{"
                + "x = " + x + " "
                + "y = " + y +
                "}";
    }
    public String toSvg()//zad2
    {
        return String.format(Locale.ENGLISH, "<circle r=\"5\" cx=\"%f\" cy=\"%f\" fill=\"red\" />", x, y);
    }
    public void translate(double dx, double dy)//zad3
    {
        x += dx;
        y += dy;
    }
    public Point translated(double dx, double dy)//zad3
    {
        Point p = new Point();
        p.x = x + dx;
        p.y = y + dy;
        return p;
    }
}
