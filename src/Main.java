//importo la clase circulo
import es.uah.matcomp.mp.e1.ejerciciosclases.e2.Circle;

public class Main { // Save as "TestCircle.java"
    public static void main(String[] args) {
        // creo dos nuevos circulos para probar el to String de forma implicita
        Circle c1 = new Circle(1.1);
        System.out.println(c1);
        Circle c2 = new Circle(); // default constructor
        System.out.println(c2);
        //uso la funcion set para cambiar el radio del circulo c1
        c1.setRadius(2.2);
        //imprimo el circulo c1 con el toString
        System.out.println(c1); // toString()
        //imprimo el radio del circulo atraves de la función getRadius
        System.out.println("radius is: " + c1.getRadius());
        //pruebo las funciones getArea y getCircumference
        System.out.printf("area is: %.2f%n", c1.getArea());
        System.out.printf("circumference is: %.2f%n", c1.getCircumference());


    }
}