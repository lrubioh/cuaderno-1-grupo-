package es.uah.matcomp.mp.e4.ejerciciosclases.e1;


public abstract class Shape {
    /**DECLARO LOS ATRIBUTOS PROTEGIDOS**/
    protected String color = "red";
    protected boolean filled = true;
    /**DECLARO LOS MÉTODOS PUBLICOS**/
    //Constructor por defecto
    public Shape() {
    }
    //Constructor con parámetros para definir color y si está relleno.
    public Shape(String color, Boolean filled) {
        this.color = color;
        this.filled = filled;
    }
    /**ZONA DE GETTERS Y SETTERS**/
    //devuelve el color de la forma
    public String getColor() {
        return color;
    }
    //establece el color de la forma
    public void setColor(String color) {
        this.color = color;
    }
    //devuelve si la forma está rellena
    public boolean isFilled() {
        return filled;
    }
    //establece si la forma está rellena
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    //metodo abstracto para obetner el área de la forma
    public abstract double getArea();
    // metodo abstracto para obtener el perímetro de la forma
    public abstract double getPerimeter();
    //devuelve una representación en cadena del texto
    @Override
    public String toString() {
        return "Shape[color=" + color + ", filled=" + filled + "]";
    }
}
