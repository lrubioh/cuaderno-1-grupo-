package es.uah.matcomp.mp.e3.ejerciciosclases.e4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class PointTest {

    @Test
    void getX() {
        // Inicializa el objeto Point
        Point point = new Point(3.5f, 5.5f);
        // Verifica que el valor de X sea correcto
        assertEquals(3.5f, point.getX(), "El valor de X debería ser 3.5");
    }

    @Test
    void setX() {
        // Inicializa el objeto Point
        Point point = new Point(3.5f, 5.5f);
        // Cambia el valor de X y verifica que se haya actualizado correctamente
        point.setX(6.5f);
        assertEquals(6.5f, point.getX(), "El valor de X debería ser 6.5");
    }

    @Test
    void getY() {
        // Inicializa el objeto Point
        Point point = new Point(3.5f, 5.5f);
        // Verifica que el valor de Y sea correcto
        assertEquals(5.5f, point.getY(), "El valor de Y debería ser 5.5");
    }

    @Test
    void setY() {
        // Inicializa el objeto Point
        Point point = new Point(3.5f, 5.5f);
        // Cambia el valor de Y y verifica que se haya actualizado correctamente
        point.setY(7.5f);
        assertEquals(7.5f, point.getY(), "El valor de Y debería ser 7.5");
    }

    @Test
    void setXY() {
        // Inicializa el objeto Point
        Point point = new Point(3.5f, 5.5f);
        // Establece las coordenadas X y Y simultáneamente y verifica que se hayan actualizado
        point.setXY(6.5f, 7.5f);
        assertEquals(6.5f, point.getX(), "El valor de X debería ser 6.5");
        assertEquals(7.5f, point.getY(), "El valor de Y debería ser 7.5");
    }

    @Test
    void getXY() {
        // Inicializa el objeto Point
        Point point = new Point(3.5f, 5.5f);
        // Verifica que el método getXY devuelva el array correcto de coordenadas
        float[] coords = point.getXY();
        assertEquals(3.5f, coords[0], "La coordenada X debería ser 3.5");
        assertEquals(5.5f, coords[1], "La coordenada Y debería ser 5.5");
    }

    @Test
    void testToString() {
        // Inicializa el objeto Point
        Point point = new Point(3.5f, 5.5f);
        // Verifica que el método toString devuelva la representación correcta del punto
        assertEquals("(3.5, 5.5)", point.toString(), "La representación en cadena debería ser (3.5, 5.5)");
    }
}