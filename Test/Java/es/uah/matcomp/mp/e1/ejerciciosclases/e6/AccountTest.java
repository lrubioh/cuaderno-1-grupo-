package es.uah.matcomp.mp.e1.ejerciciosclases.e6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
    //veo que el metodo getID me devuelve el valor de ID
    @Test
    void getID() {
        Account a1 = new Account("A101", "Tan Ah Teck", 88);
        assertEquals("A101", a1.getID());
    }
    //pruebo el metodo getName viendo que lo que me devuelve sea igual a "Tan Ah Teck"
    @Test
    void getName() {
        Account a1 = new Account("A101", "Tan Ah Teck", 88);
        assertEquals("Tan Ah Teck", a1.getName());
    }
    //pruebo el metodo getBalance viendo que lo que me devuelve sea igual a 88
    @Test
    void getBalance() {
        Account a1 = new Account("A101", "Tan Ah Teck", 88);
        assertEquals(88, a1.getBalance());
    }
    //pruebo el metodo credit viendo que el dinero de la cuenta mas el que le añado sea
    //igual que lo que me devuelve el metodo getBalance
    @Test
    void credit() {
        Account a1 = new Account("A101", "Tan Ah Teck", 88);
        a1.credit(100);
        assertEquals(100+88, a1.getBalance());
    }
    //pruebo el metodo debit comprobandolo para los dos casos y viendo que el dinero que habia
    //menos el dinero que quito sea igual a lo que me devuelve el metodo getBalance
    @Test
    void debit() {
        Account a1 = new Account("A101", "Tan Ah Teck", 88);
        a1.debit(8);
        assertEquals(88-8 , a1.getBalance());
    }
    //pruebo el metodo transferTo
    @Test
    void transferTo() {
        Account a1 = new Account("A101", "Maria", 88);
        Account a2 = new Account("A102", "Laura", 100);
        a1.transferTo(a2, 80);
        //pruebo que el dinero de a2 sea igual al dinero que ya tenia mas lo transferido
        assertEquals(100+80, a2.getBalance());
        //pruebo que el dinero de a1 sea el dinero menos lo transferido
        assertEquals(8, a1.getBalance());
    }
    //pruebo el toString viendo que lo que me devuelve sea igual a lo que deberia usando los metodos getters
    @Test
    void testToString() {
        Account a1 = new Account("A101", "Tan Ah Teck", 88);
        assertEquals("Account{" + "id='" + a1.getID() + '\'' + ", name='" + a1.getName() + '\'' + ", balance=" + a1.getBalance() + '}', a1.toString());
    }
}