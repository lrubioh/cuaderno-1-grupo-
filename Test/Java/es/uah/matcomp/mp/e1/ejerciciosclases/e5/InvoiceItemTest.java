package es.uah.matcomp.mp.e1.ejerciciosclases.e5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceItemTest {
    //compruebo que "A101" sea igual a inv1.getId()
    @Test
    void getId() {
        InvoiceItem inv1 = new InvoiceItem("A101", "Pen Red", 888, 0.08);
        assertEquals("A101", inv1.getId());
    }
    //pruebo que "Pen Red" sea igual a lo que el metodo getDesc me devuelve
    @Test
    void getDesc() {
        InvoiceItem inv1 = new InvoiceItem("A101", "Pen Red", 888, 0.08);
        assertEquals("Pen Red", inv1.getDesc());
    }
    //pruebo que 888 sea igual a lo que me devuelve el metodo getQty
    @Test
    void getQty() {
        InvoiceItem inv1 = new InvoiceItem("A101", "Pen Red", 888, 0.08);
        assertEquals(888, inv1.getQty());
    }
    //pruebo el metodo setQty dandole valor al qty y luego comprobando que ese valor
    //sea igual a lo que el metodo getQty me devuelve
    @Test
    void setQty() {
        InvoiceItem inv1 = new InvoiceItem("A101", "Pen Red", 888, 0.08);
        inv1.setQty(900);
        assertEquals(900, inv1.getQty());
    }
    //veo que 0.08 sea igual a lo que el metodo getUnitPrice me devuelve
    @Test
    void getUnitPrice() {
        InvoiceItem inv1 = new InvoiceItem("A101", "Pen Red", 888, 0.08);
        assertEquals(0.08, inv1.getUnitPrice());
    }
    //compruebo el metodo setUnitPrice dandole valor al unitPrice y con el assertEquals veo que
    //el valor que le he dado y lo me devuelve el metodo sean iguales
    @Test
    void setUnitPrice() {
        InvoiceItem inv1 = new InvoiceItem("A101", "Pen Red", 888, 0.08);
        inv1.setUnitPrice(5);
        assertEquals(5, inv1.getUnitPrice());
    }
    //pruebo el metodo getTotal viendo que la cantidad por el precio por unidad sea
    //igual a lo que me devuelve el metodo getTotal
    @Test
    void getTotal() {
        InvoiceItem inv1 = new InvoiceItem("A101", "Pen Red", 888, 0.08);
        assertEquals(888*0.08, inv1.getTotal());
    }
    //veo que el metodo to string funcione comparandolo con los getters de cada una de las funciones
    @Test
    void testToString() {
        InvoiceItem inv1 = new InvoiceItem("A101", "Pen Red", 888, 0.08);
        assertEquals("InvoiceItem[id=" + inv1.getId() + ", desc=" + inv1.getDesc() + ", qty=" + inv1.getQty() + ", unitPrice=" + inv1.getUnitPrice() + "]", inv1.toString());
    }
}