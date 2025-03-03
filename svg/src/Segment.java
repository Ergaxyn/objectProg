public class Segment {
    public Point a = new Point();
    public Point b = new Point();

    public double length()
    {
        return Math.hypot(a.x - b.x, a.y - b.y);
    }
    //next
}
