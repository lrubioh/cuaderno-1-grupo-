package es.uah.matcomp.mp.e3.ejerciciosclases.e5;

/**
 * Clase que introduce el cuadrado con extensión del rectángulo
 */
public class Square extends Rectangle {

    /**
     * Constructor por defecto
     */
    public Square() {
    }

    /**
     * Constructor con el lado
     */
    public Square(double side){
        super(side, side);
    }

    /**
     * Constructor con el lado, color, y si está completo
     */
    public Square(double side, String color, boolean filled ) {
        super(side, side, color, filled);
    }

    /**
     * Devuelve el lado del cuadrado
     */
    public double getSide(){
        return getWidth();
    }

    /**
     * Establece el lado con la longitud y el ancho
     */
    public void setSide(double side){
        setWidth(side);
        setLength(side);
    }

    /**
     * Sobrecarga de métodos de rectángulo
     */
    public void setWidht(double side){
        super.setWidth(side);
        super.setLength(side);
    }

    public void setLength(double side){
        super.setWidth(side);
        super.setLength(side);
    }

    /**
     * Cadena que representa el cuadrado
     * @return
     */
    @Override
    public String toString(){
        return "Square[" + super.toString() + "]";
    }
}
