package es.uah.matcomp.mp.e3.ejerciciosclases.e6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MammalTest {

    @Test
    void testToString() {
        // Creamos un objeto de tipo Mammal con un nombre
        Mammal mammal = new Mammal("Lion");

        // La salida esperada será algo como "Mammal[Animal[name=Lion]]"
        String expected = "Mammal[Animal[name=Lion]]";

        // Verificamos que la representación en cadena del Mammal sea la esperada
        assertEquals(expected, mammal.toString());
    }
}