package es.uah.matcomp.mp.e3.ejerciciosclases.e7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PointTest {

    // Prueba para el método getX
    @Test
    void getX() {
        // Creamos un objeto Point con las coordenadas (10, 20)
        Point p = new Point(10, 20);

        // Verificamos que el valor de la coordenada X sea 10
        assertEquals(10, p.getX(), "El valor de X debe ser 10");
    }

    // Prueba para el método getY
    @Test
    void getY() {
        // Creamos un objeto Point con las coordenadas (10, 20)
        Point p = new Point(10, 20);

        // Verificamos que el valor de la coordenada Y sea 20
        assertEquals(20, p.getY(), "El valor de Y debe ser 20");
    }

    // Prueba para el método setX
    @Test
    void setX() {
        // Creamos un objeto Point con las coordenadas iniciales (10, 20)
        Point p = new Point(10, 20);

        // Establecemos un nuevo valor para la coordenada X (30)
        p.setX(30);

        // Verificamos que la coordenada X haya sido actualizada correctamente a 30
        assertEquals(30, p.getX(), "El valor de X debe ser actualizado a 30");
    }

    // Prueba para el método setY
    @Test
    void setY() {
        // Creamos un objeto Point con las coordenadas iniciales (10, 20)
        Point p = new Point(10, 20);

        // Establecemos un nuevo valor para la coordenada Y (40)
        p.setY(40);

        // Verificamos que la coordenada Y haya sido actualizada correctamente a 40
        assertEquals(40, p.getY(), "El valor de Y debe ser actualizado a 40");
    }

    // Prueba para el método setXY
    @Test
    void setXY() {
        // Creamos un objeto Point con las coordenadas iniciales (10, 20)
        Point p = new Point(10, 20);

        // Establecemos nuevos valores para las coordenadas X e Y (50, 60)
        p.setXY(50, 60);

        // Verificamos que las coordenadas X e Y hayan sido actualizadas correctamente
        assertEquals(50, p.getX(), "El valor de X debe ser actualizado a 50");
        assertEquals(60, p.getY(), "El valor de Y debe ser actualizado a 60");
    }

    // Prueba para el método toString
    @Test
    void testToString() {
        // Creamos un objeto Point con las coordenadas (10, 20)
        Point p = new Point(10, 20);

        // Definimos la representación esperada de la cadena
        String expected = "Point: (10, 20)";

        // Verificamos que la representación en cadena sea la esperada
        assertEquals(expected, p.toString(), "El resultado de toString debe ser 'Point: (10,20)'");
    }
}