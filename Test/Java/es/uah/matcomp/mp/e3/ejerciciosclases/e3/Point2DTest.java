package es.uah.matcomp.mp.e3.ejerciciosclases.e3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Point2DTest {

    @Test
    void getX() {
        // Crear una instancia de Point2D
        Point2D point = new Point2D(1.0f, 2.0f);
        // Verificamos que el valor de X es 1.0f
        assertEquals(1.0f, point.getX());
    }

    @Test
    void setX() {
        // Crear una instancia de Point2D
        Point2D point = new Point2D(1.0f, 2.0f);
        // Establecemos un nuevo valor para X y verificamos que se haya actualizado
        point.setX(3.0f);
        assertEquals(3.0f, point.getX());
    }

    @Test
    void getY() {
        // Crear una instancia de Point2D
        Point2D point = new Point2D(1.0f, 2.0f);
        // Verificamos que el valor de Y es 2.0f
        assertEquals(2.0f, point.getY());
    }

    @Test
    void setY() {
        // Crear una instancia de Point2D
        Point2D point = new Point2D(1.0f, 2.0f);
        // Establecemos un nuevo valor para Y y verificamos que se haya actualizado
        point.setY(4.0f);
        assertEquals(4.0f, point.getY());
    }

    @Test
    void setXY() {
        // Crear una instancia de Point2D
        Point2D point = new Point2D(1.0f, 2.0f);
        // Establecemos nuevos valores para X e Y simultáneamente
        point.setXY(5.0f, 6.0f);
        assertEquals(5.0f, point.getX());
        assertEquals(6.0f, point.getY());
    }

    @Test
    void getXY() {
        // Crear una instancia de Point2D
        Point2D point = new Point2D(1.0f, 2.0f);
        // Verificamos que el método getXY devuelva el array con las coordenadas correctas
        float[] coords = point.getXY();
        assertEquals(1.0f, coords[0]);
        assertEquals(2.0f, coords[1]);
    }

    @Test
    void testToString() {
        // Crear una instancia de Point2D
        Point2D point = new Point2D(1.0f, 2.0f);
        // Verificamos que el método toString() devuelva el formato esperado "(x, y)"
        assertEquals("(1.0, 2.0)", point.toString());
    }
}