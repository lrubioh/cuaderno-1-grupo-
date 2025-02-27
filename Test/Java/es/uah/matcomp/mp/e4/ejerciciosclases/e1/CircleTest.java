package es.uah.matcomp.mp.e4.ejerciciosclases.e1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//Pruebas unitarias para la clase Circle.
class CircleTest {

    //Prueba del constructor por defecto.
    @Test
    void testDefaultConstructor() {
        Circle circle = new Circle();
        assertEquals(1.0, circle.getRadius(), 0.001);
        assertEquals("red", circle.getColor());
        assertTrue(circle.isFilled());
    }

    //Prueba del constructor con radio especificado.
    @Test
    void testConstructorWithRadius() {
        Circle circle = new Circle(5.5);
        assertEquals(5.5, circle.getRadius(), 0.001);
    }

    //Prueba del constructor con radio, color y si está relleno.
    @Test
    void testConstructorWithAllParameters() {
        Circle circle = new Circle(3.0, "blue", false);
        assertEquals(3.0, circle.getRadius(), 0.001);
        assertEquals("blue", circle.getColor());
        assertFalse(circle.isFilled());
    }

    //Prueba del metodo getRadius().
    @Test
    void getRadius() {
        Circle circle = new Circle(2.5);
        assertEquals(2.5, circle.getRadius(), 0.001);
    }

    //Prueba del metodo setRadius().
    @Test
    void setRadius() {
        Circle circle = new Circle();
        circle.setRadius(4.2);
        assertEquals(4.2, circle.getRadius(), 0.001);
    }

    //Prueba del metodo getArea().
    @Test
    void getArea() {
        Circle circle = new Circle(3.0);
        assertEquals(Math.PI * 3.0 * 3.0, circle.getArea(), 0.001);
    }

    //Prueba del metodo getPerimeter().
    @Test
    void getPerimeter() {
        Circle circle = new Circle(3.0);
        assertEquals(2 * Math.PI * 3.0, circle.getPerimeter(), 0.001);
    }

    //Prueba del metodo toString().
    @Test
    void testToString() {
        Circle circle = new Circle(2.0, "yellow", true);
        assertEquals("Circle[Shape[color=yellow, filled=true], radius=2.0]", circle.toString());
    }
}