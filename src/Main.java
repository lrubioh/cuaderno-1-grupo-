import es.uah.matcomp.mp.e3.ejerciciosclases.e7.Point;
import es.uah.matcomp.mp.e3.ejerciciosclases.e7.LineSub;

public class Main {
    public static void main(String[] args) {
        // Creando línea con coordenadas
        LineSub l1 = new LineSub(0, 0, 3, 4);
        System.out.println(l1);
        System.out.println("Longitud: " + l1.getLength());
        System.out.println("Gradiente: " + l1.getGradient());

        // Creando línea con objetos Point
        Point p1 = new Point(5, 10);
        Point p2 = new Point(15, 20);
        LineSub l2 = new LineSub(p1, p2);
        System.out.println(l2);
        System.out.println("Longitud: " + l2.getLength());
        System.out.println("Gradiente: " + l2.getGradient());

        // Probando setters
        l2.setBegin(new Point(2, 3));
        l2.setEnd(new Point(8, 6));
        System.out.println("Después de cambiar puntos: " + l2);
    }
}
