package es.uah.matcomp.mp.e3.ejerciciosclases.e8;

// Definición de la clase Cylinder usando composición
public class Cylinder {
    private Circle base; // Composición: Un cilindro tiene un círculo base
    private double height; // Altura del cilindro

    // Constructor por defecto: inicializa el círculo base y la altura
    public Cylinder() {
        base = new Circle(); // Se crea un nuevo objeto Circle
        height = 1.0; // Altura por defecto
    }

    // Constructor con parámetros
    public Cylinder(double radius, String color, double height) {
        base = new Circle(radius, color); // Se inicializa el círculo con valores dados
        this.height = height; // Se asigna la altura proporcionada
    }

    // Método para calcular el volumen del cilindro
    public double getVolume() {
        return base.getArea() * height; // Volumen = área de la base * altura
    }

    // Método para obtener la altura
    public double getHeight() {
        return height;
    }

    // Método para obtener el radio de la base
    public double getRadius() {
        return base.getRadius();
    }

    // Método para obtener el color de la base
    public String getColor() {
        return base.getColor();
    }

    // Método toString para representar el cilindro como cadena de texto
    @Override
    public String toString() {
        return "Cylinder[base=" + base.toString() + ", height=" + height + "]";
    }
}
