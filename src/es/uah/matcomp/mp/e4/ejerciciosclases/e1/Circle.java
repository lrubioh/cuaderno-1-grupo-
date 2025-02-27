package es.uah.matcomp.mp.e4.ejerciciosclases.e1;

//Clase Circle que hereda de Shape y representa un círculo.
//Contiene un atributo para el radio y métodos para calcular el área y el perímetro.
public class Circle extends Shape {
    /**DECLARO LOS ATRIBUTOS PRIVADOS**/
    private double radius = 1.0;
    //constructor por defecto
    /**DECLARO LOS MÉTODOS PÚBLICOS***/
    public Circle() {}
    //Contrsuctor con parámetros para definir el radio
    public Circle(double radius) {
        this.radius = radius;
    }

    //Constructor con parámetros para definir el radio, color y si está relleno.
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }
    /**ZONA DE GETTERS Y SETTERS**/
    //Devuelve el radio del circulo
    public double getRadius() {
        return radius;
    }

    //Establece el radio del circulo
    public void setRadius(double radius) {
        this.radius = radius;
    }

    //Calcula y devuelve el área del circulo
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    //Calcula y devuelve el perimetro del circulo
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    //Devuelve una representación en cadena con la información del obejto circle
    @Override
    public String toString() {
        return "Circle[" + super.toString() + ", radius=" + radius + "]";
    }
}
