package es.uah.matcomp.mp.e4.ejerciciosclases.e5;

//Clase que representa un círculo e implementa la interfaz GeometricObject.
//Proporciona métodos para calcular el área y el perímetro del círculo.
public class Circle implements GeometricObject {
    /**DECLARO LOS ATRIBUTSO**/
    protected double radius;
    /**ZONA DE METODOS**/
    //Constructor de la clase Circle.
    public Circle(double radius) {
        this.radius = radius;
    }
    //Calcula y devuelve el área del círculo.
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
    //Calcula y devuelve el perímetro del círculo.
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
    //Representación en cadena del círculo.
    @Override
    public String toString() {
        return "Circle[radius=" + radius + "]";
    }

}