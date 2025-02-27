import es.uah.matcomp.mp.e4.ejerciciosclases.e3.MovablePoint;
public class Main {
    public static void main(String[] args) {
        // Crear un punto en (0,0) con velocidad (2,3)
        MovablePoint point = new MovablePoint(0, 0, 2, 3);
        System.out.println("Posición inicial: " + point);

        // Mover el punto en diferentes direcciones
        point.moveUp();
        System.out.println("Después de moveUp(): " + point);

        point.moveDown();
        System.out.println("Después de moveDown(): " + point);

        point.moveLeft();
        System.out.println("Después de moveLeft(): " + point);

        point.moveRight();
        System.out.println("Después de moveRight(): " + point);
    }
}
