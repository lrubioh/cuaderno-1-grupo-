package es.uah.matcomp.mp.e4.ejerciciosclases.e1;

//Clase Square que hereda de Rectangle y representa un cuadrado.
//Contiene un atributo para el lado y métodos para calcular el área y el perímetro.

public class Square extends Rectangle {
    //constructor por defecto
    /**DECLARO LOS METODOS PUBLICOS**/
    public Square() {
        super(1.0, 1.0);
    }
    //Constructor con parámetro para definir el lado.
    public Square(double side) {
        super(side, side);
    }
    //Constructor con parámetros para definir el lado, color y si está relleno.
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }
    /**ZONA DE GETTERS Y SETTERS**/
    //Devuelve el lado del cuadrado.
    public double getSide() {
        return super.getWidth();
    }
    //Establece el lado del cuadrado.
    public void setSide(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public void setLength(double length) {
        setSide(length);
    }
    //Devuelve una representación en cadena del objeto Square.
    @Override
    public String toString() {
        return "Square[" + super.toString() + "]";
    }
}
