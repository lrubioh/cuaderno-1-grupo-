package es.uah.matcomp.mp.e2.ejerciciosclases.e1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {/**Test para la clase book*/

    /**Prueba la clase del getIsbn donde se comprueba que se devuelve el isbn correcto del libro*/
    @Test
    void getIsbn() {
        Author a1 = new Author("John Doe", "john.doe@gmail.com");
        Book b1 = new Book("987654284", "La casita", a1, 40);
        assertEquals("987654284", b1.getIsbn());
    }
    /**Prueba que se devuelva el nombre correcto del libro b1*/
    @Test
    void getName() {
        Author a1 = new Author("John Doe", "john.doe@gmail.com");
        Book b1 = new Book("987654284", "La casita", a1, 40);
        assertEquals("La casita", b1.getName());

    }
    /**Prueba que se devuelva el nombre correcto del autor del libro*/
    @Test
    void getAuthor() {
        Author a1 = new Author("John Doe", "john.doe@gmail.com");
        Book b1 = new Book("987654284", "La casita", a1, 40);
        assertEquals(a1, b1.getAuthor());
    }
    /**Prueba que se devuelva el precio establecido del libro*/
    @Test
    void getPrice() {
        Author a1 = new Author("John Doe", "john.doe@gmail.com");
        Book b1 = new Book("987654284", "La casita", a1, 40);
        assertEquals(40, b1.getPrice());
    }
    /** Establece un valor concreto de precio a través del setPrice y se comprueba
    * que el valor establecido es el que se devuelve*/
    @Test
    void setPrice() {
        Author a1 = new Author("John Doe", "john.doe@gmail.com");
        Book b1 = new Book("987654284", "La casita", a1, 40);
        b1.setPrice(25);
        assertEquals(25, b1.getPrice());
    }
    /**Prueba que se devuelva la cantidad concreta de ejemplares de libros que hay*/
    @Test
    void getQty() {
        Author a1 = new Author("John Doe", "john.doe@gmail.com");
        Book b1 = new Book("987654284", "La casita", a1, 40,20);
        assertEquals(20, b1.getQty());
    }
    /** Establece un valor concreto de cantidad de ejemplares de libros a través del setQty y se comprueba
     * que el valor establecido es el que se devuelve*/
    @Test
    void setQty() {
        Author a1 = new Author("John Doe", "john.doe@gmail.com");
        Book b1 = new Book("987654284", "La casita", a1, 40,20);
        b1.setQty(10);
        assertEquals(10, b1.getQty());
    }
    /**Se prueba que se devuelve el nombre del autor del libro correctamente*/
    @Test
    void getAuthorName() {
        Author a1 = new Author("John Doe", "john.doe@gmail.com");
        Book b1 = new Book("987654284", "La casita", a1, 40,20);
        assertEquals("John Doe", b1.getAuthorName());
    }

    /**Prueba el metodo toString de manera que se devuelva de manera correcta la cadena establecida
     * sobre los datos del libro*/
    @Test
    void testToString() {
        Author a1 = new Author("John Doe", "john.doe@gmail.com");
        Book b1 = new Book("987654284", "La casita", a1, 40,20);
        assertEquals("Book[isbn=987654284, Author=[name=La casita,email=john.doe@gmail.com], price=40.0, qty=20]", b1.toString());
    }
}