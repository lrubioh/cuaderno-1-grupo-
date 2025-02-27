package es.uah.matcomp.mp.e4.ejerciciosclases.e1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//Clase de pruebas unitarias para la clase Rectangle.
//Se validan los constructores, métodos de acceso y cálculo de área y perímetro.

class RectangleTest {
    //Prueba del constructor por defecto.
    //Se espera que los valores iniciales sean 1.0 para ancho y largo.
    @Test
    void testDefaultConstructor() {
        Rectangle rect = new Rectangle();
        assertEquals(1.0, rect.getWidth());
        assertEquals(1.0, rect.getLength());
    }

    //Prueba del constructor con parámetros de ancho y largo.
    @Test
    void testParameterizedConstructor() {
        Rectangle rect = new Rectangle(5.0, 10.0);
        assertEquals(5.0, rect.getWidth());
        assertEquals(10.0, rect.getLength());
    }

    //Prueba del constructor con parámetros de ancho, largo, color y si está relleno.
    @Test
    void testFullConstructor() {
        Rectangle rect = new Rectangle(3.0, 6.0, "red", true);
        assertEquals(3.0, rect.getWidth());
        assertEquals(6.0, rect.getLength());
        assertEquals("red", rect.getColor());
        assertTrue(rect.isFilled());
    }

    //Prueba del metodo setWidth().
    @Test
    void testSetWidth() {
        Rectangle rect = new Rectangle();
        rect.setWidth(4.5);
        assertEquals(4.5, rect.getWidth());
    }

    //Prueba del metodo setLength().
    @Test
    void testSetLength() {
        Rectangle rect = new Rectangle();
        rect.setLength(7.2);
        assertEquals(7.2, rect.getLength());
    }

    //Prueba del cálculo del área.
    @Test
    void testGetArea() {
        Rectangle rect = new Rectangle(4.0, 5.0);
        assertEquals(20.0, rect.getArea());
    }

    //Prueba del cálculo del perímetro.
    @Test
    void testGetPerimeter() {
        Rectangle rect = new Rectangle(3.0, 6.0);
        assertEquals(18.0, rect.getPerimeter());
    }

    //Prueba del metodo toString().
    @Test
    void testToString() {
        Rectangle rect = new Rectangle(2.0, 3.0, "blue", false);
        String expected = "Rectangle[Shape[color=blue, filled=false], width=2.0, length=3.0]";
        assertEquals(expected, rect.toString());
    }
}