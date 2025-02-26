import es.uah.matcomp.mp.e3.ejerciciosclases.e3.Point2D;
import es.uah.matcomp.mp.e3.ejerciciosclases.e3.Point3D;

public class Main {
    public static void main(String[] args) {
        // Crear un objeto de la clase Point2D
        Point2D point2D = new Point2D(1.5f, 2.5f);
        System.out.println("Punto 2D: " + point2D); // Se llama a toString()

        // Obtener y mostrar coordenadas
        System.out.println("X: " + point2D.getX());
        System.out.println("Y: " + point2D.getY());

        // Modificar coordenadas
        point2D.setXY(3.0f, 4.0f);
        System.out.println("Nuevo Punto 2D: " + point2D);

        // Obtener coordenadas como array
        float[] coords2D = point2D.getXY();
        System.out.println("Coordenadas del Punto 2D: (" + coords2D[0] + ", " + coords2D[1] + ")");

        // Crear un objeto de la clase Point3D
        Point3D point3D = new Point3D(1.0f, 2.0f, 3.0f);
        System.out.println("Punto 3D: " + point3D); // Se llama a toString()

        // Obtener y mostrar coordenadas
        System.out.println("X: " + point3D.getX());
        System.out.println("Y: " + point3D.getY());
        System.out.println("Z: " + point3D.getZ());

        // Modificar coordenadas
        point3D.setXYZ(4.0f, 5.0f, 6.0f);
        System.out.println("Nuevo Punto 3D: " + point3D);

        // Obtener coordenadas como array
        float[] coords3D = point3D.getXYZ();
        System.out.println("Coordenadas del Punto 3D: (" + coords3D[0] + ", " + coords3D[1] + ", " + coords3D[2] + ")");
    }
}