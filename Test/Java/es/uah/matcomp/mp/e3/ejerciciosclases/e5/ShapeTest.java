package es.uah.matcomp.mp.e3.ejerciciosclases.e5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapeTest {

    @Test
    void getColor() {
        Shape shape = new Shape(); // Usamos el constructor por defecto
        assertEquals("red", shape.getColor()); // Verificamos que el color por defecto sea "red"
    }

    @Test
    void setColor() {
        Shape shape = new Shape(); // Usamos el constructor por defecto
        shape.setColor("blue"); // Establecemos un nuevo color
        assertEquals("blue", shape.getColor()); // Verificamos que el color se haya cambiado correctamente
    }

    @Test
    void isFilled() {
        Shape shape = new Shape(); // Usamos el constructor por defecto
        assertTrue(shape.isFilled()); // Verificamos que el valor por defecto de "filled" sea true
    }

    @Test
    void setFilled() {
        Shape shape = new Shape(); // Usamos el constructor por defecto
        shape.setFilled(false); // Establecemos "filled" en false
        assertFalse(shape.isFilled()); // Verificamos que "filled" se haya cambiado correctamente
    }

    @Test
    void testToString() {
        Shape shape = new Shape(); // Usamos el constructor por defecto
        String expected = "Shape [color=red, filled=true]"; // La representación esperada
        assertEquals(expected, shape.toString()); // Verificamos que la salida de toString sea la esperada
    }
}