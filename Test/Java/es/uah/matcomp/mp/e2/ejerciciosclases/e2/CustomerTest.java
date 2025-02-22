package es.uah.matcomp.mp.e2.ejerciciosclases.e2;

import es.uah.matcomp.mp.e2.ejerciciosclases.e2.Customer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {/**Test de la clase e2/customer */
    /**Se prueba que devuelva correctamente el id del cliente*/
    @Test
    void getId() {
        Customer c1 = new Customer(70, "María Perez", 10);
        assertEquals(70, c1.getId());
    }
    /**Se prueba que devuelva correctamente el nombre del cliente*/
    @Test
    void getName() {
        Customer c1 = new Customer(70, "María Perez", 10);
        assertEquals("María Perez", c1.getName());
    }
    /**Se prueba que devuelva correctamente el descuento del cliente*/
    @Test
    void getDiscount() {
        Customer c1 = new Customer(70, "María Perez", 10);
        assertEquals(10, c1.getDiscount());
    }
    /**Se establece un uevo valor de descuento a partir del setDiscount y se prueba
     * que el valor retornado sea el correcto*/
    @Test
    void setDiscount() {
        Customer c1 = new Customer(70, "María Perez", 10);
        c1.setDiscount(20);
        assertEquals(20, c1.getDiscount());
    }
    /**Prueba el metodo toString de manera que se devuelva de manera correcta la cadena establecida
     * sobre los datos del cliente*/
    @Test
    void testToString() {
        Customer c1 = new Customer(70, "María Perez", 10);
        assertEquals("María Perez(70)(10%)", c1.toString());
    }
}