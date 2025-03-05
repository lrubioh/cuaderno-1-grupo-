package es.uah.matcomp.mp.e3.ejerciciosclases.e2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    // Prueba para el método getName
    @Test
    void getName() {
        // Se crea un objeto Person con nombre "John" y dirección "123 Main Street"
        Person person = new Person("John", "123 Main Street");

        // Se verifica que el método getName devuelva el valor esperado ("John")
        assertEquals("John", person.getName());
    }

    // Prueba para el método getAddress
    @Test
    void getAddress() {
        // Se crea un objeto Person con nombre "John" y dirección "123 Main Street"
        Person person = new Person("John", "123 Main Street");

        // Se verifica que el método getAddress devuelva el valor esperado ("123 Main Street")
        assertEquals("123 Main Street", person.getAddress());
    }

    // Prueba para el método setAddress
    @Test
    void setAddress() {
        // Se crea un objeto Person con nombre "John" y dirección "123 Main Street"
        Person person = new Person("John", "123 Main Street");

        // Se cambia la dirección del objeto person a "678 Main Street"
        person.setAddress("678 Main Street");

        // Se verifica que la dirección haya sido actualizada correctamente
        assertEquals("678 Main Street", person.getAddress());
    }

    // Prueba para el método toString
    @Test
    void testToString() {
        // Se crea un objeto Person con nombre "John" y dirección "123 Main Street"
        Person person = new Person("John", "123 Main Street");

        // Se define la cadena esperada que el método toString debería devolver
        String expectedString = "Person[name=John, address=123 Main Street]";

        // Se verifica que el método toString devuelva la cadena esperada
        assertEquals(expectedString, person.toString());
    }
}