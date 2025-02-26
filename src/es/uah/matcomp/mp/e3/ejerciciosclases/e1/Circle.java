package es.uah.matcomp.mp.e3.ejerciciosclases.e1;

/**
 * Clase que representa al circulo
 */
public class Circle {
    private double radius = 1.0;
    private String color = "red";

    /**
     * Constructor por defecto
     */
    public Circle() {
    }

    /**
     * Constructor que inicializa al circulo con su radio
     */
    public Circle(double radius){
        this.radius = radius;
    }

    /**
     * Constructor que inicializa al circulo con el radio y el color
     */
    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    /**
     * Devuelve el radio del circulo
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Establece un radio para el circulo
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * Devuelve el color del circulo
     */
    public String getColor() {
        return color;
    }

    /**
     * Establece un color para el circulo
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Método que calcula el área del círculo
     */
    public double getArea() {
        return Math.PI * radius * radius;
    }

    /**
     * Método toString que devuelve una representación en cadena del circulo
     */
    @Override
    public String toString() {
        return "Circle [radius=" + radius + ", color=" + color + "]";
    }
}
