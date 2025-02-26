import es.uah.matcomp.mp.e3.ejerciciosclases.e4.Point;
import es.uah.matcomp.mp.e3.ejerciciosclases.e4.MovablePoint;

public class Main {
    public static void main(String[] args) {
        Point p = new Point(3.5f,5.5f);
        MovablePoint mp = new MovablePoint(3.5f,5.5f,1.0f,1.5f);

        System.out.println(p);
        System.out.println(mp);

        mp.move();
        System.out.println("After move: " + mp);
    }
}