package es.uah.matcomp.mp.e2.ejerciciosclases.primeroprueba;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookpruebaTest {/**Test de la clase Bookprueba*/
    /**Comprueba si el nombre retornado del libro es el correcto*/
    @Test
    void getName() {
        Authorprueba a1 = new Authorprueba("Sofia Lopez", "sofia.lopez@gmail.com",'f');
        Bookprueba book = new Bookprueba("El coche azul", a1, 39, 10);
        assertEquals("El coche azul", book.getName());
    }
    /**Comprueba si los datos del autor del libro es el correcto*/
    @Test
    void getAuthorprueba() {
        Authorprueba a1 = new Authorprueba("Sofia Lopez", "sofia.lopez@gmail.com",'f');
        Bookprueba book = new Bookprueba("El coche azul", a1, 39, 10);
        assertEquals("Authorprueba{name= 'Sofia Lopez', email= 'sofia.lopez@gmail.com',gender= 'f'}", book.getAuthorprueba());
    }
    /**Comprueba si el precio retornado del libro es el correcto*/
    @Test
    void getPrice() {
        Authorprueba a1 = new Authorprueba("Sofia Lopez", "sofia.lopez@gmail.com",'f');
        Bookprueba book = new Bookprueba("El coche azul", a1, 39, 10);
        assertEquals(39, book.getPrice());
    }
    /**Establece un nuevo precio del libro y comprueba que el valor retornado es el correcto*/
    @Test
    void setPrice() {
        Authorprueba a1 = new Authorprueba("Sofia Lopez", "sofia.lopez@gmail.com",'f');
        Bookprueba book = new Bookprueba("El coche azul", a1, 39, 10);
        book.setPrice(45);
        assertEquals(45, book.getPrice());
    }
    /**Comprueba si la cantidad de ejemplares retornado del libro es la correcta*/
    @Test
    void getQty() {
        Authorprueba a1 = new Authorprueba("Sofia Lopez", "sofia.lopez@gmail.com",'f');
        Bookprueba book = new Bookprueba("El coche azul", a1, 39, 10);
        assertEquals(10, book.getQty());
    }
    /**Establece una nueva cantidad de ejemplares del libro y comprueba que el valor retornado es el correcto*/
    @Test
    void setQty() {
        Authorprueba a1 = new Authorprueba("Sofia Lopez", "sofia.lopez@gmail.com",'f');
        Bookprueba book = new Bookprueba("El coche azul", a1, 39, 10);
        book.setQty(20);
        assertEquals(20, book.getQty());
    }
    /**Prueba el metodo toString de manera que se devuelva de manera correcta la cadena establecida
     * sobre los datos del bookprueba*/
    @Test
    void testToString() {
        Authorprueba a1 = new Authorprueba("Sofia Lopez", "sofia.lopez@gmail.com",'f');
        Bookprueba book = new Bookprueba("El coche azul", a1, 39, 10);
        assertEquals("Book[name=El coche azul, Author=[name= 'Sofia Lopez', email= 'sofia.lopez@gmail.com'], price=39, qty=10]", book.toString());
    }
    /**Comprueba que el nombre del autor del libro es correcto*/
    @Test
    void getAuthorpruebaName() {
        Authorprueba a1 = new Authorprueba("Sofia Lopez", "sofia.lopez@gmail.com",'f');
        Bookprueba book = new Bookprueba("El coche azul", a1, 39, 10);
        assertEquals("Sofia Lopez", book.getAuthorpruebaName());
    }
    /**Comprueba que el email del autor del libro es correcto*/
    @Test
    void getAuthorpruebaEmail() {
        Authorprueba a1 = new Authorprueba("Sofia Lopez", "sofia.lopez@gmail.com", 'f');
        Bookprueba book = new Bookprueba("El coche azul", a1, 39, 10);
        assertEquals("sofia.lopez@gmail.com", book.getAuthorpruebaEmail());
    }
    /**Comprueba que el genero del autor del libro es correcto*/
    @Test
    void getAuthorpruebaGender() {
        Authorprueba a1 = new Authorprueba("Sofia Lopez", "sofia.lopez@gmail.com", 'f');
        Bookprueba book = new Bookprueba("El coche azul", a1, 39, 10);
        assertEquals("f", book.getAuthorpruebaGender());
    }
}