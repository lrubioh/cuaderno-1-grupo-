package es.uah.matcomp.mp.e4.ejerciciosclases.e2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
//Clase de prueba para la clase Rectangle.
//Se realizan pruebas unitarias sobre sus métodos.
class RectangleTest {

    //Prueba el constructor de Rectangle con parámetros de ancho y largo.
    @Test
    void testConstructor() {
        Rectangle r = new Rectangle(5.0, 10.0);
        assertEquals(5.0, r.getWidth());
        assertEquals(10.0, r.getLength());
    }

    //Prueba el metodo getWidth().
    @Test
    void testGetWidth() {
        Rectangle r = new Rectangle(4.0, 6.0);
        assertEquals(4.0, r.getWidth());
    }

    //Prueba el metodo setWidth().
    @Test
    void testSetWidth() {
        Rectangle r = new Rectangle(4.0, 6.0);
        r.setWidth(8.0);
        assertEquals(8.0, r.getWidth());
    }

    //Prueba el metodo getLength().
    @Test
    void testGetLength() {
        Rectangle r = new Rectangle(4.0, 6.0);
        assertEquals(6.0, r.getLength());
    }

    //Prueba el metodo setLength().
    @Test
    void testSetLength() {
        Rectangle r = new Rectangle(4.0, 6.0);
        r.setLength(12.0);
        assertEquals(12.0, r.getLength());
    }

    //Prueba el cálculo del área del rectángulo.
    @Test
    void testGetArea() {
        Rectangle r = new Rectangle(4.0, 6.0);
        assertEquals(24.0, r.getArea());
    }

    //Prueba el cálculo del perímetro del rectángulo.
    @Test
    void testGetPerimeter() {
        Rectangle r = new Rectangle(4.0, 6.0);
        assertEquals(48.0, r.getPerimeter());
    }

    //Prueba el metodo toString().
    @Test
    void testToString() {
        Rectangle r = new Rectangle(3.0, 7.0);
        String result = r.toString();
        assertTrue(result.contains("width=3.0"));
        assertFalse(result.contains("length=7.0"));
    }
}