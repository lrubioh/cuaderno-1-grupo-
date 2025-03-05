package es.uah.matcomp.mp.e3.ejerciciosclases.e6;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    @Test
    void testToString() {
        // Creamos un objeto Animal con un nombre
        Animal animal = new Animal("Lion");

        // La salida esperada es "Animal[name=Lion]"
        String expected = "Animal[name=Lion]";

        // Verificamos que la representación en cadena del Animal sea la esperada
        assertEquals(expected, animal.toString());
    }
}