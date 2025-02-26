package es.uah.matcomp.mp.e3.ejerciciosclases.e5;

/**
 * Clase que introduce las formas
 */
public class Shape {
    private String color = "red";
    private boolean filled = true;

    /**
     * Constructor por defecto
     */
    public Shape() {
    }

    /**
     * Constructor con los colores y si está completo
     */
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    /**
     * Devuelve el color de la figura
     */
    public String getColor() {
        return color;
    }

    /**
     * Establece un nuevo color en la figura
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Devuelve si está completo
     */
    public boolean isFilled() {
        return filled;
    }


    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    /**
     * Devuelve una representación en cadena de la figura
     */
    @Override
    public String toString() {
        return "Shape [color=" + color + ", filled=" + filled + "]";
    }
}
