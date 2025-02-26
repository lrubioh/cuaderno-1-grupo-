import es.uah.matcomp.mp.e3.ejerciciosclases.e5.Shape;
import es.uah.matcomp.mp.e3.ejerciciosclases.e5.Circle;
import es.uah.matcomp.mp.e3.ejerciciosclases.e5.Rectangle;
import es.uah.matcomp.mp.e3.ejerciciosclases.e5.Square;

public class Main {
    public static void main(String[] args) {
        // Crear un objeto de la clase Shape (No se puede instanciar si es abstracta)
        // Shape shape = new Shape("blue", false);
        // System.out.println(shape);

        // Crear un objeto de la clase Circle
        Circle circle = new Circle(5.0, "yellow", true);
        System.out.println("Círculo: " + circle);
        System.out.println("Radio: " + circle.getRadius());
        System.out.println("Área: " + circle.getArea());
        System.out.println("Perímetro: " + circle.getPerimeter());

        // Modificar el radio del círculo
        circle.setRadius(7.0);
        System.out.println("Nuevo radio: " + circle.getRadius());

        // Crear un objeto de la clase Rectangle
        Rectangle rectangle = new Rectangle(4.0, 6.0, "green", false);
        System.out.println("Rectángulo: " + rectangle);
        System.out.println("Ancho: " + rectangle.getWidth());
        System.out.println("Largo: " + rectangle.getLength());
        System.out.println("Área: " + rectangle.getArea());
        System.out.println("Perímetro: " + rectangle.getPerimeter());

        // Modificar ancho y largo
        rectangle.setWidth(8.0);
        rectangle.setLength(10.0);
        System.out.println("Nuevo ancho: " + rectangle.getWidth());
        System.out.println("Nuevo largo: " + rectangle.getLength());

        // Crear un objeto de la clase Square
        Square square = new Square(5.0, "red", true);
        System.out.println("Cuadrado: " + square);
        System.out.println("Lado: " + square.getSide());
        System.out.println("Área: " + square.getArea());
        System.out.println("Perímetro: " + square.getPerimeter());

        // Modificar lado del cuadrado
        square.setSide(6.0);
        System.out.println("Nuevo lado: " + square.getSide());
    }
}
