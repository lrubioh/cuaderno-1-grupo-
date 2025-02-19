package es.uah.matcomp.mp.e1.ejerciciosclases.e1;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    //pruebo el getRadius usando un circulo c1 que creo con los valores por defecto (radius=1)entonces comparo el c1.getRadius
    //que me devuelve el radio de c1 y le comparo con 1 que es el radio por defecto probando asi que si que que funciona la
    //funcion getRadius y devuelve lo que tiene que devolver
    @org.junit.jupiter.api.Test
    void getRadius() {
        Circle c1 = new Circle();
        assertEquals(c1.getRadius(),1);

    }
    //comparo el valor de c1.getArea con 1*1*Math.PI que el la forma que me da el area del circulo, como el circulo esta creado
    //por defecto el radio sera igual a 1
    @org.junit.jupiter.api.Test
    void getArea() {
        Circle c1 = new Circle();
        assertEquals(c1.getArea(), Math.PI);
    }
    //comparo el color por defecto del circulo con el c1.getColor que es la funcion que me devuelve el color del circulo c1
    @org.junit.jupiter.api.Test
    void getColor() {
        Circle c1 = new Circle();
        assertEquals(c1.getColor(), "red");
    }
    //pruebo la funcion setRadius dandole valor 10 por ejemplo al radio y luego comparando ese 10 con el c1.getRadius viendo asi que
    //como la funcion getRadius me devuelve el radio 10 entonces el setRadius ha funcionado como deberia
    @org.junit.jupiter.api.Test
    void setRadius() {
        Circle c1 = new Circle();
        c1.setRadius(10);
        c1.getRadius();
        assertEquals(c1.getRadius(), 10);
    }
    //repito lo mismo que con el setRadius, cambio el color del circulo a verde con el metodo setColor() y comparo el color "verde" con el c1.getColor
    //el cual me devuelve el color del circulo c1 despues del set

    @org.junit.jupiter.api.Test
    void setColor() {
        Circle c1 = new Circle();
        c1.setColor("verde");
        c1.getColor();
        assertEquals(c1.getColor(), "verde");

    }
    //pruebo el toString comparando el toString del circulo c1 con lo que me deberia de devolver

    @org.junit.jupiter.api.Test
    void testToString() {
        Circle c1 = new Circle();
        assertEquals(c1.toString(), "Circle{radius=" + c1.getRadius() + ", color='" + c1.getColor() + '}');
    }
}