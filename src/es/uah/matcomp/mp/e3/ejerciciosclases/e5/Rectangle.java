package es.uah.matcomp.mp.e3.ejerciciosclases.e5;

/**
 * Clase que introduce un rectángulo con su ancho y longitud
 */
public class Rectangle extends Shape{
    private double width = 1.0;
    private double length = 1.0;

    /**
     * Constructor por defecto
     */
    public Rectangle(){
    }

    /**
     * Constructor con el ancho y la longitud
     */
    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }

    /**
     * Constructor con el ancho. longitud, color y si está completo
     */
    public Rectangle(double width, double length, String color, boolean filled){
        super(color,filled);
        this.width = width;
        this.length = length;
    }

    /**
     * Devuelve el ancho del rectángulo
     */
    public double getWidth() {
        return width;
    }

    /**
     * Establece un nuevo ancho para el rectángulo
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * Devuelve la longitud del rectángulo
     */
    public double getLength() {
        return length;
    }

    /**
     * Establece una nueva longitud para el rectángulo
     */
    public void setLength(double length) {
        this.length = length;
    }

    /**
     * Método para calcular el área del rectángulo
     */
    public double getArea(){
        return width * length;
    }

    /**
     * Método para calcular el perímetro del rectángulo
     */
    public double getPerimeter(){
        return 2 * width + 2 * length;
    }

    /**
     * Devuelve una representación en cadena de los datos del rectángulo
     */
    @Override
    public String toString(){
        return "Rectangle[" + super.toString() + ", width=" + getWidth() + ", length=" + getLength() + "]]";
    }
}
