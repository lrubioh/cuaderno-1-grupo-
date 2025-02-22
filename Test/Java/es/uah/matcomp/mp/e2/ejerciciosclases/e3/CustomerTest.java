package es.uah.matcomp.mp.e2.ejerciciosclases.e3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {/**Test de la clase e3/Customer */
    /**Prueba que el id del cliente que se retona es el correcto*/
    @Test
    void getId() {
        Customer customer = new Customer(9, "Paula Sirian", 'f');
        assertEquals(9, customer.getId());
    }
    /**Pruebo que el nombre que se retorna del cliente es el correcto*/
    @Test
    void getName() {
        Customer customer = new Customer(9, "Paula Sirian", 'f');
        assertEquals("Paula Sirian", customer.getName());
    }
    /**Pruebo que el nombre que se retorna con el correspondiente al cliente */
    @Test
    void getGender() {
        Customer customer = new Customer(9, "Paula Sirian", 'f');
        assertEquals('f', customer.getGender());
    }
    /**Prueba el metodo toString de manera que se devuelva de manera correcta la cadena establecida
     * sobre los datos de a la factura*/
    @Test
    void testToString() {
        Customer customer = new Customer(9, "Paula Sirian", 'f');
        assertEquals("Paula Sirian(f)", customer.toString());
    }
}