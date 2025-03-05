package es.uah.matcomp.mp.e3.ejerciciosclases.e6;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Clase de prueba para la clase Dog
 */
class DogTest {

    /**
     * Prueba del método greets para verificar que no lanza excepciones
     */
    @Test
    void greets() {
        Dog dog = new Dog("Buddy");
        assertDoesNotThrow(() -> dog.greets());
    }

    /**
     * Prueba del método greets sobrecargado para otro perro
     */
    @Test
    void testGreets() {
        Dog dog1 = new Dog("Buddy");
        Dog dog2 = new Dog("Max");
        assertDoesNotThrow(() -> dog1.greets(dog2));
    }

    /**
     * Prueba del método toString para verificar la representación en cadena del objeto Dog
     */
    @Test
    void testToString() {
        Dog dog = new Dog("Buddy");
        assertEquals("Dog[Mammal[Animal[name=Buddy]]]", dog.toString());
    }
}
