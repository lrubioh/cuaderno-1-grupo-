package es.uah.matcomp.mp.e3.ejerciciosclases.e6;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Clase de prueba para la clase Cat
 */
class CatTest {

    /**
     * Prueba del método greets para verificar que no lanza excepciones
     */
    @Test
    void greets() {
        Cat cat = new Cat("Whiskers");
        assertDoesNotThrow(() -> cat.greets());
    }

    /**
     * Prueba del método toString para verificar la representación en cadena del objeto Cat
     */
    @Test
    void testToString() {
        Cat cat = new Cat("Whiskers");
        assertEquals("Cat[Mammal[Animal[name=Whiskers]]]", cat.toString());
    }
}
