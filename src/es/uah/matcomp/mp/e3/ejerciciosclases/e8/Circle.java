package es.uah.matcomp.mp.e3.ejerciciosclases.e8;

// Definición de la clase Circle
public class Circle {
    private double radius; // Radio del círculo
    private String color;  // Color del círculo

    // Constructor por defecto: asigna valores predeterminados
    public Circle() {
        this.radius = 1.0;  // Radio por defecto
        this.color = "red"; // Color por defecto
    }

    // Constructor con parámetros: permite definir radio y color
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    // Método para obtener el radio
    public double getRadius() {
        return radius;
    }

    // Método para obtener el color
    public String getColor() {
        return color;
    }

    // Método para calcular el área del círculo
    public double getArea() {
        return Math.PI * radius * radius; // Fórmula: π * r²
    }

    // Método toString para representar el círculo como cadena de texto
    @Override
    public String toString() {
        return "Circle[radius=" + radius + ", color=" + color + "]";
    }
}

