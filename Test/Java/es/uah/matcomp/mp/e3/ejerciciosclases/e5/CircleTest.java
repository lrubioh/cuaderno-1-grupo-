package es.uah.matcomp.mp.e3.ejerciciosclases.e5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void getRadius() {
        Circle circle = new Circle(5); // Usamos el constructor con el radio
        assertEquals(5, circle.getRadius(), 0.001); // Verificamos que el radio sea 5
    }

    @Test
    void setRadius() {
        Circle circle = new Circle(5); // Usamos el constructor con el radio
        circle.setRadius(10); // Cambiamos el radio a 10
        assertEquals(10, circle.getRadius(), 0.001); // Verificamos que el radio se haya actualizado correctamente
    }

    @Test
    void getArea() {
        Circle circle = new Circle(5); // Usamos el constructor con el radio
        double expectedArea = Math.PI * 5 * 5; // Área esperada: π * radio^2
        assertEquals(expectedArea, circle.getArea(), 0.001); // Verificamos que el área sea correcta
    }

    @Test
    void getPerimeter() {
        Circle circle = new Circle(5); // Usamos el constructor con el radio
        double expectedPerimeter = 2 * Math.PI * 5; // Perímetro esperado: 2 * π * radio
        assertEquals(expectedPerimeter, circle.getPerimeter(), 0.001); // Verificamos que el perímetro sea correcto
    }

    @Test
    void testToString() {
        Circle circle = new Circle(5, "blue", true); // Usamos el constructor con el radio, color y si está relleno
        String expected = "Circle[Shape [color=blue, filled=true], radius=5.0]"; // Representación esperada
        assertEquals(expected, circle.toString()); // Verificamos que la salida de toString sea la esperada
    }
}