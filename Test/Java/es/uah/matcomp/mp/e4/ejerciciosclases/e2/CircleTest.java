package es.uah.matcomp.mp.e4.ejerciciosclases.e2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//Clase de prueba para la clase Circle.
//Se realizan pruebas unitarias sobre los métodos de la clase.

class CircleTest {

    //Prueba el constructor por defecto de Circle.
    @Test
    void testDefaultConstructor() {
        Circle c = new Circle();
        assertEquals(1.0, c.getRadius());
    }

    //Prueba el constructor con parámetro de radio.
    @Test
    void testParameterizedConstructor() {
        Circle c = new Circle(5.0);
        assertEquals(5.0, c.getRadius());
    }

    //Prueba el constructor con radio, color y estado de relleno.
    @Test
    void testFullConstructor() {
        Circle c = new Circle(7.0, "blue", true);
        assertEquals(7.0, c.getRadius());
    }

    //Prueba el metodo setRadius.
    @Test
    void testSetRadius() {
        Circle c = new Circle();
        c.setRadius(3.5);
        assertEquals(3.5, c.getRadius());
    }

    //Prueba el cálculo del área del círculo.
    @Test
    void testGetArea() {
        Circle c = new Circle(2.0);
        assertEquals(Math.PI * 4, c.getArea(), 0.01);
    }

    //Prueba el cálculo del perímetro del círculo.
    @Test
    void testGetPerimeter() {
        Circle c = new Circle(2.0);
        assertEquals(2 * Math.PI * 2.0, c.getPerimeter(), 0.01);
    }

    //Prueba el metodo toString del círculo.
    @Test
    void testToString() {
        Circle c = new Circle(4.0);
        assertTrue(c.toString().contains("radius=4.0"));
    }
}