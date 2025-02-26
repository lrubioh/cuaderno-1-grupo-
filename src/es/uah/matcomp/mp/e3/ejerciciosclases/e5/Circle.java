package es.uah.matcomp.mp.e3.ejerciciosclases.e5;

/**
 * Clase que introduce un círculo con extensión de las figuras
 */
public class Circle extends Shape{
    private double radius = 1.0;

    /**
     * Constructor por defecto
     */
    public Circle() {
    }

    /**
     * Constructor con el radio del círculo
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * Constructor con el radio, el color y si está completo
     */
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    /**
     * Devuelve el radio del circulo
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Establece un nuevo radio del circulo
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * Método que calcula el área del círculo
     */
    public double getArea() {
        return Math.PI * radius * radius;
    }

    /**
     * Método que calcula el perímetro del círculo
     */
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    /**
     * Devuelve una representación en cadena de los datos del círculo
     */
    @Override
    public String toString() {
        return "Circle[" + super.toString() + ", radius=" + getRadius() + "]]";
    }
}
