package es.uah.matcomp.mp.e4.ejerciciosclases.e1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//Clase de pruebas unitarias para la clase Square.
//Se validan los constructores, métodos de acceso y cálculo de área y perímetro.

class SquareTest {

    //Prueba del constructor por defecto.
    //Se espera que el lado inicial sea 1.0.
    @Test
    void testDefaultConstructor() {
        Square square = new Square();
        assertEquals(1.0, square.getSide());
    }

    //Prueba del constructor con parámetro para el lado.
    @Test
    void testSideConstructor() {
        Square square = new Square(4.0);
        assertEquals(4.0, square.getSide());
    }

    //Prueba del constructor con parámetros para el lado, color y si está relleno.
    @Test
    void testFullConstructor() {
        Square square = new Square(5.0, "green", true);
        assertEquals(5.0, square.getSide());
        assertEquals("green", square.getColor());
        assertTrue(square.isFilled());
    }

    //Prueba del metodo setSide().
    @Test
    void testSetSide() {
        Square square = new Square();
        square.setSide(3.5);
        assertEquals(3.5, square.getSide());
    }

    //Prueba del metodo setWidth() (debe modificar el lado del cuadrado).
    @Test
    void testSetWidth() {
        Square square = new Square();
        square.setWidth(2.5);
        assertEquals(2.5, square.getSide());
    }

    //Prueba del metodo setLength() (debe modificar el lado del cuadrado).
    @Test
    void testSetLength() {
        Square square = new Square();
        square.setLength(6.0);
        assertEquals(6.0, square.getSide());
    }

    //Prueba del metodo toString().
    @Test
    void testToString() {
        Square square = new Square(2.0, "blue", false);
        String expected = "Square[Rectangle[Shape[color=blue, filled=false], width=2.0, length=2.0]]";
        assertEquals(expected, square.toString());
    }
}