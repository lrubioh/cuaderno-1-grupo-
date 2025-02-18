//importo la clase circulo
import es.uah.matcomp.mp.e1.ejerciciosclases.e1.Circle;

public class Main { // Save as "TestCircle.java"
    public static void main(String[] args) {
        //declaro la clase circulo con sus valores por defecto
        Circle c1 = new Circle();
        //imprimo por pantalla el radio y el area del circulo llamando a las funciones
        //getRadius y getArea
        System.out.println("The circle has radius of " + c1.getRadius() + " and area of " + c1.getArea());
        /** me tiene que devolver radio =1 y area =  3,14...**/

        //creo un nuevo circulo c2 con un radio concreto que en este caso es 2
        Circle c2 = new Circle(2.0);
        //imprimo el radio y el area
        System.out.println("The circle has radius of " + c2.getRadius() + " and area of " + c2.getArea());
        /**el radio =2 y el area es 12,56**/
        //creo un nuevo circulo con los valores por defecto(radio=1, color=red)
        Circle c4 = new Circle();
        //cambio el radio de 1 a 5,5 con la funcion setRadius
        c4.setRadius(5.5);
        //imprimo el radio del circulo c4
        System.out.println("radius is: " + c4.getRadius());
        //cambio el color con la funcion setColor de rojo a verde
        c4.setColor("green");
        //imprimo el color con la funcion getColor
        System.out.println("color is: " + c4.getColor());

        //creo un nuevo circulo para probar la funcion string tostring
        Circle c5 = new Circle(5.5);
        System.out.println(c5.toString());

        Circle c6 = new Circle(6.6);
        //prubo diferentes metodos de llamar al toString para imprimir el circulo
        System.out.println(c6.toString());
        System.out.println(c6);
        System.out.println("Operator '+' invokes toString() too: " + c6);



    }
}