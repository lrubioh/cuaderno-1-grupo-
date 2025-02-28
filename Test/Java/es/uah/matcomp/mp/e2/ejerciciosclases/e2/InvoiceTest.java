package es.uah.matcomp.mp.e2.ejerciciosclases.e2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceTest {/**Test de la clase Invoice*/
    /**Se comprueba que el id de la factura sea el correcto*/
    @Test
    void getId() {
        Customer c1 = new Customer(70, "María Perez", 10);
        Invoice i1 = new Invoice(1, c1, 800);
        assertEquals(70, c1.getId());
    }
    /**Se prueba que se devuelvan los datos del cliente correctamente*/
    @Test
    void getCustomer() {
        Customer c1 = new Customer(70, "Maria Perez", 10);
        Invoice i1 = new Invoice(1, c1, 800);
        assertEquals(i1.getCustomer(), c1);
    }
    /**Se establecen los datos de un nuevo cliente a partir del setCustomer y
     * se comprueba que los datos retornados sean correctos*/
    @Test
    void setCustomer() {
        Customer c1 = new Customer(70, "Maria Perez", 10);
        Customer c2 = new Customer(80, "Carla Sanchez", 30);
        Invoice i1 = new Invoice(1, c1, 800);
        i1.setCustomer(c2);
        assertEquals(i1.getCustomer(), c2);
    }
    /**Se comprueba que el valor retornado del importe sea el correcto*/
    @Test
    void getAmount() {
        Customer c1 = new Customer(70, "Maria Perez", 10);
        Invoice i1 = new Invoice(1, c1, 800);
        assertEquals(i1.getAmount(), 800);
    }
    /**Se establece un nuevo importe a aprtir del setAmount y se comprueba que
     * el valor retornado sea el correcto y el establecido*/
    @Test
    void setAmount() {
        Customer c1 = new Customer(70, "Maria Perez", 10);
        Invoice i1 = new Invoice(1, c1, 800);
        i1.setAmount(1000);
        assertEquals(i1.getAmount(), 1000);
    }
    /**Se comprueba que el id del cliente sea el corrrecto de la factura*/
    @Test
    void getCustomerId() {
        Customer c1 = new Customer(70, "Maria Perez", 10);
        Invoice i1 = new Invoice(1, c1, 800);
        assertEquals(i1.getCustomerId(), c1.getId());
    }
    /**Se comprueba que el nombre de la factura corresponda con el establecido
     * del cliente*/
    @Test
    void getCustomerName() {
        Customer c1 = new Customer(70, "Maria Perez", 10);
        Invoice i1 = new Invoice(1, c1, 800);
        assertEquals(i1.getCustomerName(), c1.getName());
    }
    /**Se comprueba que el descuento aplicado en la factura corresponda con el establecido
     * del cliente*/
    @Test
    void getCustomerDiscount() {
        Customer c1 = new Customer(70, "Maria Perez", 10);
        Invoice i1 = new Invoice(1, c1, 800);
        assertEquals(i1.getCustomerDiscount(), 10);
    }
    /**Se comprueba que el importe a pagar despues de aplicar el porcentaje de descuento del
     * cliente sea el correcto*/
    @Test
    void getAmountAfterDiscount() {
        Customer c1 = new Customer(70, "Maria Perez", 10);
        Invoice i1 = new Invoice(1, c1, 800);
        assertEquals(i1.getAmountAfterDiscount(), 720);
    }
    /**Prueba el metodo toString de manera que se devuelva de manera correcta la cadena establecida
     * sobre los datos de a la factura*/
    @Test
    void testToString() {
        Customer c1 = new Customer(70, "Maria Perez", 10);
        Invoice i1 = new Invoice(1, c1, 800);
        assertEquals("Invoice [id=1, customer=Maria Perez(70)(10%)Maria Perez, amount=800.0]", i1.toString());
    }
}