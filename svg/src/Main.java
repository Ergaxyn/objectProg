public class Main {
    public static void main(String[] args) {
        Point p = new Point();
        p.x = 5.0;
        p.y = 7.5;
        System.out.println(p);
        System.out.println(p.toSvg());
        Segment s1 = new Segment();
        s1.a = p;
        s1.b = p;
    }
}
