package es.uah.matcomp.mp.e4.ejerciciosclases.e2;

//Contiene atributos para el color y si está rellena.
public class Rectangle implements GeometricObject {
    /**DECLARO LOS ATRIBUTOS PRIVADOS**/
    private double width;
    private double lenght;
    /**DECLARO LOS METODOS PUBLICOS**/
    //Creo un constructor por defecto con los parametros del ancho y largo del rectangulo.
    public Rectangle(double width, double lenght) {
        this.width = width;
        this.lenght = lenght;
    }
    /**ZONA DE GETTERS Y SETTERS**/
    //Obtiene el ancho del rectángulo.
    public double getWidth() {
        return width;
    }

    //Establece el ancho del rectángulo.
    public void setWidth(double width) {
        this.width = width;
    }

    //Obtiene la longitud del rectángulo.
    public double getLength() {
        return lenght;
    }

    //Establece la longitud del rectángulo.
    public void setLength(double lenght) {
        this.lenght = lenght;
    }
    //Calcula el area del rectangulo
    @Override
    public double getArea() {
        return width * lenght;
    }
    //Calcula el perimetro del rectangulo
    @Override
    public double getPerimeter() {
        return 2 * width * lenght;
    }
    //Devuelve una representación en cadena con la información del obejto Rectangle
    @Override
    public String toString() {
        return "Rectangle{" + "width=" + width + ", lenght=" + lenght + '}';
    }
}