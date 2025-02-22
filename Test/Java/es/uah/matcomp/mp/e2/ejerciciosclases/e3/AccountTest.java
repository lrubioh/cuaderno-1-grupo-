package es.uah.matcomp.mp.e2.ejerciciosclases.e3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {/**Test de la clase Account*/
    /**Prueba que el id del recibo es el correspondiente */
    @Test
    void getId() {
        Customer customer = new Customer(9, "Paula Sirian", 'f');
        Account a1 = new Account(12, customer);
        assertEquals(12, a1.getId());
    }
    /**Prueba que los datos del cliente que figuran en el recibo son los correspondientes*/
    @Test
    void getCustomer() {
        Customer customer = new Customer(9, "Paula Sirian", 'f');
        Account a1 = new Account(12, customer);
        assertEquals(customer, a1.getCustomer());
    }
    /**Prueba que el balance del recibo es el correspondiente */
    @Test
    void getBalance() {
        Customer customer = new Customer(9, "Paula Sirian", 'f');
        Account a1 = new Account(12, customer,90);
        assertEquals(90, a1.getBalance());
    }
    /**A través del setBalance se establece un nuevo balance y se prueba
     * que el valor retornado sea el establecido nuevo*/
    @Test
    void setBalance() {
        Customer customer = new Customer(9, "Paula Sirian", 'f');
        Account a1 = new Account(12, customer, 90);
        a1.setBalance(10);
        assertEquals(10, a1.getBalance());
    }
    /**Prueba el metodo toString de manera que se devuelva de manera correcta la cadena establecida
     * sobre los datos del recibo*/
    @Test
    void testToString() {
        Customer customer = new Customer(9, "Paula Sirian", 'f');
        Account a1 = new Account(12, customer, 90);
        assertEquals("Paula Sirian(12), balance= $90", a1.toString());
    }
    /**Prueba que el nombre que aparece en el recibo sea el correcto y coincida
     * con los datos del cliente*/
    @Test
    void getCustomerName() {
        Customer customer = new Customer(9, "Paula Sirian", 'f');
        Account a1 = new Account(12, customer, 90);
        assertEquals("Paula Sirian", a1.getCustomerName());
    }
    /**Comprueba que el depósito establecido sea el correcto*/
    @Test
    void deposit() {
        Customer customer = new Customer(9, "Paula Sirian", 'f');
        Account a1 = new Account(12, customer, 90);
        a1.deposit(200);
        assertEquals(200, a1.getBalance());
    }
    /**Comprueba si con el depósito que tengo puedo seguir gastando dinero o no
     * en funcion de lo que me vaya quedando en el despósito*/
    @Test
    void withdraw() {
        Customer customer = new Customer(9, "Paula Sirian", 'f');
        Account a1 = new Account(12, customer, 90);
        a1.withdraw(200);
        assertEquals(110, a1.getBalance());
    }
}