package es.uah.matcomp.mp.e3.ejerciciosclases.e5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    void getSide() {
        Square square = new Square(5); // Usamos el constructor con el lado
        assertEquals(5, square.getSide(), 0.001); // Verificamos que el lado devuelto sea 5
    }

    @Test
    void setSide() {
        Square square = new Square(5); // Usamos el constructor con el lado
        square.setSide(10); // Cambiamos el lado a 10
        assertEquals(10, square.getSide(), 0.001); // Verificamos que el lado se haya actualizado correctamente
    }

    @Test
    void setWidht() {
        Square square = new Square(5); // Usamos el constructor con el lado
        square.setWidht(7); // Cambiamos el ancho a 7 (el cual también afectará al largo, ya que es un cuadrado)
        assertEquals(7, square.getSide(), 0.001); // Verificamos que el lado se haya actualizado correctamente
    }

    @Test
    void setLength() {
        Square square = new Square(5); // Usamos el constructor con el lado
        square.setLength(8); // Cambiamos el largo a 8 (el cual también afectará al ancho, ya que es un cuadrado)
        assertEquals(8, square.getSide(), 0.001); // Verificamos que el lado se haya actualizado correctamente
    }

    @Test
    void testToString() {
        Square square = new Square(5, "blue", true); // Usamos el constructor con el lado, color y relleno
        String expected = "Square[Rectangle[Shape [color=blue, filled=true], width=5.0, length=5.0]]"; // La representación esperada
        assertEquals(expected, square.toString()); // Verificamos que la salida de toString sea la esperada
    }
}