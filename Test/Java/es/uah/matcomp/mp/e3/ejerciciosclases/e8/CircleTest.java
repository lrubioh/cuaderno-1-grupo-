package es.uah.matcomp.mp.e3.ejerciciosclases.e8;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void getRadius() {
        // Creamos un objeto Circle con un radio de 5.0
        Circle circle = new Circle(5.0, "blue");

        // Verificamos que el radio sea correcto
        assertEquals(5.0, circle.getRadius());
    }

    @Test
    void getColor() {
        // Creamos un objeto Circle con color "blue"
        Circle circle = new Circle(5.0, "blue");

        // Verificamos que el color sea correcto
        assertEquals("blue", circle.getColor());
    }

    @Test
    void getArea() {
        // Creamos un objeto Circle con un radio de 5.0
        Circle circle = new Circle(5.0, "blue");

        // Verificamos que el área sea correcta usando la fórmula π * r²
        double expectedArea = Math.PI * 5.0 * 5.0; // Esperamos que el área sea 25 * π
        assertEquals(expectedArea, circle.getArea(), 0.0001); // Usamos un margen de error pequeño para la comparación
    }

    @Test
    void testToString() {
        // Creamos un objeto Circle con un radio de 5.0 y color "blue"
        Circle circle = new Circle(5.0, "blue");

        // Verificamos que la cadena generada por toString sea la esperada
        String expected = "Circle[radius=5.0, color=blue]";
        assertEquals(expected, circle.toString());
    }
}