import es.uah.matcomp.mp.e4.ejerciciosclases.e5.ResizableCircle;

public class Main {
    public static void main(String[] args) {
        // Crear un círculo de radio 10
        ResizableCircle resizableCircle = new ResizableCircle(10.0);
        System.out.println("Círculo inicial: " + resizableCircle);
        System.out.println("Área inicial: " + resizableCircle.getArea());
        System.out.println("Perímetro inicial: " + resizableCircle.getPerimeter());

        // Redimensionar el círculo al 50%
        resizableCircle.resize(50);
        System.out.println("\nDespués de reducir al 50%:");
        System.out.println("Círculo: " + resizableCircle);
        System.out.println("Área: " + resizableCircle.getArea());
        System.out.println("Perímetro: " + resizableCircle.getPerimeter());

        // Redimensionar el círculo al 200% (doblar tamaño)
        resizableCircle.resize(200);
        System.out.println("\nDespués de aumentar al 200%:");
        System.out.println("Círculo: " + resizableCircle);
        System.out.println("Área: " + resizableCircle.getArea());
        System.out.println("Perímetro: " + resizableCircle.getPerimeter());
    }
}
