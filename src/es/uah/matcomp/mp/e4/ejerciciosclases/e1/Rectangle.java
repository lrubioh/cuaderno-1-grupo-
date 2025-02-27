package es.uah.matcomp.mp.e4.ejerciciosclases.e1;


//Clase Rectangle que hereda de Shape y representa un rectángulo.
//Contiene atributos para el color y si está rellena, junto con métodos abstractos para obtener el área y el perímetro.
public class Rectangle extends Shape {
    /**DECLARO LOS ATRIBUTOS PRIVADOS**/
    private double width = 1.0;
    private double length = 1.0;
    /**DECLARO LOS METODOS PUBLICOS**/
    //Constructor por defecto
    public Rectangle() {
    }
    //Constructor con parametros de ancho y longitud
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }
    //Constructor con parámetros para definir ancho, longitud, color y si está relleno.
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }
    /**ZONA DE GETTERS Y STTERS**/
    //Devuelve el ancho del rectángulo.
    public double getWidth() {
        return width;
    }
    //Establece el ancho del rectángulo.
    public void setWidth(double width) {
        this.width = width;
    }
    //Devuelve la longitud del rectángulo.
    public double getLength() {
        return length;
    }
    //Establece la longitud del rectángulo.
    public void setLength(double length) {
        this.length = length;
    }
    //Calcula el area del rectangulo
    @Override
    public double getArea() {
        return width * length;
    }
    //Calcula el perimetro del rectangulo
    @Override
    public double getPerimeter() {
        return 2 * (width + length);
    }
    //Devuelve una representación en cadena con la información del obejto Rectangle
    @Override
    public String toString() {
        return "Rectangle[" + super.toString() + ", width=" + width + ", length=" + length + "]";
    }
}