package es.uah.matcomp.mp.e3.ejerciciosclases.e1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CylinderTest {

    // Prueba para el método getHeight
    @Test
    void getHeight() {
        // Se crea un objeto Cylinder con un radio de 5.0 y altura de 10.0
        Cylinder cylinder = new Cylinder(5.0, 10.0);

        // Se verifica que el método getHeight devuelva el valor esperado de altura (10.0)
        // El valor tolerado para la comparación es 0.001
        assertEquals(10.0, cylinder.getHeight(), 0.001, "Height should be 10.0");
    }

    // Prueba para el método getVolume
    @Test
    void getVolume() {
        // Se crea un objeto Cylinder con un radio de 5.0 y altura de 10.0
        Cylinder cylinder = new Cylinder(5.0, 10.0);

        // Se calcula el volumen esperado utilizando la fórmula:
        // Volumen = π * radio^2 * altura = π * 5.0 * 5.0 * 10.0
        double expectedVolume = Math.PI * 5.0 * 5.0 * 10.0;

        // Se verifica que el volumen calculado por el método getVolume sea el esperado
        // El valor tolerado para la comparación es 0.001
        assertEquals(expectedVolume, cylinder.getVolume(), 0.001, "Volume should be calculated correctly");
    }

    // Prueba para el método toString
    @Test
    void testToString() {
        // Se crea un objeto Cylinder con un radio de 5.0 y altura de 10.0
        Cylinder cylinder = new Cylinder(5.0, 10.0);

        // Se define la cadena esperada que el método toString debería devolver
        // El formato esperado es el siguiente:
        String expectedString = "Cylinder: subclass of Circle{radius=5.0, color='red} height=10.0";

        // Se verifica que el método toString devuelva la cadena correcta
        assertEquals(expectedString, cylinder.toString(), "toString should return the correct string representation");
    }
}