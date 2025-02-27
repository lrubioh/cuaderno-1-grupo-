import es.uah.matcomp.mp.e4.ejerciciosclases.e4.MovableCircle;
import es.uah.matcomp.mp.e4.ejerciciosclases.e4.MovablePoint;

public class Main {
    public static void main(String[] args) {
        // Crear un MovablePoint en (0, 0) con velocidad (2, 3)
        MovablePoint point = new MovablePoint(0, 0, 2, 3);
        System.out.println("Punto inicial: " + point);

        // Mover el punto en diferentes direcciones
        point.moveUp();
        System.out.println("Después de moveUp: " + point);
        point.moveDown();
        System.out.println("Después de moveDown: " + point);
        point.moveLeft();
        System.out.println("Después de moveLeft: " + point);
        point.moveRight();
        System.out.println("Después de moveRight: " + point);

        System.out.println("-------------------------");

        // Crear un MovableCircle con centro en (5, 5), velocidad (1, 1) y radio 10
        MovableCircle circle = new MovableCircle(5, 5, 1, 1, 10);
        System.out.println("Círculo inicial: " + circle);

        // Mover el círculo en diferentes direcciones
        circle.moveUp();
        System.out.println("Después de moveUp: " + circle);
        circle.moveDown();
        System.out.println("Después de moveDown: " + circle);
        circle.moveLeft();
        System.out.println("Después de moveLeft: " + circle);
        circle.moveRight();
        System.out.println("Después de moveRight: " + circle);
    }
}
