package es.uah.matcomp.mp.e3.ejerciciosclases.e5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void getWidth() {
        Rectangle rectangle = new Rectangle(5, 3); // Usamos el constructor con ancho y longitud
        assertEquals(5, rectangle.getWidth(), 0.001); // Verificamos que el ancho sea 5
    }

    @Test
    void setWidth() {
        Rectangle rectangle = new Rectangle(5, 3); // Usamos el constructor con ancho y longitud
        rectangle.setWidth(7); // Cambiamos el ancho a 7
        assertEquals(7, rectangle.getWidth(), 0.001); // Verificamos que el ancho se haya actualizado correctamente
    }

    @Test
    void getLength() {
        Rectangle rectangle = new Rectangle(5, 3); // Usamos el constructor con ancho y longitud
        assertEquals(3, rectangle.getLength(), 0.001); // Verificamos que la longitud sea 3
    }

    @Test
    void setLength() {
        Rectangle rectangle = new Rectangle(5, 3); // Usamos el constructor con ancho y longitud
        rectangle.setLength(6); // Cambiamos la longitud a 6
        assertEquals(6, rectangle.getLength(), 0.001); // Verificamos que la longitud se haya actualizado correctamente
    }

    @Test
    void getArea() {
        Rectangle rectangle = new Rectangle(5, 3); // Usamos el constructor con ancho y longitud
        assertEquals(15, rectangle.getArea(), 0.001); // Verificamos que el área sea 5 * 3 = 15
    }

    @Test
    void getPerimeter() {
        Rectangle rectangle = new Rectangle(5, 3); // Usamos el constructor con ancho y longitud
        assertEquals(16, rectangle.getPerimeter(), 0.001); // Verificamos que el perímetro sea 2 * (5 + 3) = 16
    }

    @Test
    void testToString() {
        Rectangle rectangle = new Rectangle(5, 3, "blue", true); // Usamos el constructor con ancho, longitud, color y si está relleno
        String expected = "Rectangle[Shape [color=blue, filled=true], width=5.0, length=3.0]"; // Representación esperada
        assertEquals(expected, rectangle.toString()); // Verificamos que la salida de toString sea la esperada
    }
}