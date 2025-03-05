package es.uah.matcomp.mp.e3.ejerciciosclases.e8;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CylinderTest {

    @Test
    void getVolume() {
        // Creamos un objeto Cylinder con un radio de 5.0, color "blue" y altura 10.0
        Cylinder cylinder = new Cylinder(5.0, "blue", 10.0);

        // Calculamos el volumen esperado: volumen = área de la base * altura
        double expectedVolume = Math.PI * 5.0 * 5.0 * 10.0; // Fórmula: π * r² * h
        assertEquals(expectedVolume, cylinder.getVolume(), 0.0001); // Usamos un margen de error pequeño para la comparación
    }

    @Test
    void getHeight() {
        // Creamos un objeto Cylinder con altura 10.0
        Cylinder cylinder = new Cylinder(5.0, "blue", 10.0);

        // Verificamos que la altura sea correcta
        assertEquals(10.0, cylinder.getHeight());
    }

    @Test
    void getRadius() {
        // Creamos un objeto Cylinder con un radio de 5.0
        Cylinder cylinder = new Cylinder(5.0, "blue", 10.0);

        // Verificamos que el radio de la base sea correcto
        assertEquals(5.0, cylinder.getRadius());
    }

    @Test
    void testToString() {
        // Creamos un objeto Cylinder con un radio de 5.0, color "blue" y altura 10.0
        Cylinder cylinder = new Cylinder(5.0, "blue", 10.0);

        // Verificamos que la cadena generada por toString sea la esperada
        String expected = "Cylinder[base=Circle[radius=5.0, color=blue], height=10.0]";
        assertEquals(expected, cylinder.toString());
    }
}